package com.example.demo.controller;

import com.example.demo.config.AuthorProperties;
import com.example.demo.config.StudentProperties;
import com.example.demo.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class AccountWebController {
    @Value("${nhn.student.name}")
    private String studentName;

    private final StudentProperties studentProperties;
    private final AuthorProperties authorProperties;

    private final AccountService accountService;

    @GetMapping("/web/accounts/{id}")
    public String getAccount(@PathVariable(value = "id") Long id, Model model) {
        model.addAttribute("account", accountService.getAccount(id));
        model.addAttribute("studentName", this.studentName);
        model.addAttribute("properties", this.studentProperties);
        return "account";
    }

    @ResponseBody
    @GetMapping("/system/author")
    public AuthorProperties getAuthor() {
        return authorProperties;
    }
}
