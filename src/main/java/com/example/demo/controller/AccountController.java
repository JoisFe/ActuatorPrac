package com.example.demo.controller;

import com.example.demo.Account;
import com.example.demo.service.AccountService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @GetMapping("/accounts/{id}")
    public Account getAccount(@PathVariable(value = "id") Long id) {
        return accountService.getAccount(id);
    }

    @PostMapping("/accounts")
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccounts(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @DeleteMapping("/accounts/{id}")
    public String deleteAccount(@PathVariable(value = "id") Long id) {
        accountService.deleteAccount(id);

        return "삭제 됫스요";
    }
}
