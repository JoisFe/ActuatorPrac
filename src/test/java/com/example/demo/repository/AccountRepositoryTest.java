package com.example.demo.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.Account;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    void TestAccountRepositoryTest() {
        Account account = new Account(1L, "123", 123);

        accountRepository.save(account);

        Optional<Account> account1L = accountRepository.findById(1L);

        assertThat(account1L).isPresent();
        assertThat(account1L.orElse(null)).isEqualTo(account);
    }
}