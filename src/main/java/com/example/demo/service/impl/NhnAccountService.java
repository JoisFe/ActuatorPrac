package com.example.demo.service.impl;

import com.example.demo.Account;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.AccountService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NhnAccountService implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccount(Long id) {
        return accountRepository.findById(id).orElseThrow();
    }

    @Override
    public Account createAccount(Account account) {
        boolean present = accountRepository.existsById(account.getId());

        if (present) throw new IllegalStateException("already exists");

        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
