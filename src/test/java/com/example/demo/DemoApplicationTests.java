package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.demo.service.impl.NhnAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	NhnAccountService nhnAccountService;
	//@Test
	void contextLoads() {
		assertThat(nhnAccountService.getAccounts()).hasSize(1);
	}

}
