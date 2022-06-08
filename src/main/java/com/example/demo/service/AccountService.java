package com.example.demo.service;

import com.example.demo.Account;
import java.util.List;

public interface AccountService {
    List<Account> getAccounts();

    Account getAccount(Long id);

    Account createAccount(Account account);

    void deleteAccount(Long id);
}
