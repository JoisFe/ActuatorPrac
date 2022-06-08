package com.example.demo;

import com.example.demo.config.AuthorProperties;
import com.example.demo.config.StudentProperties;
import javax.swing.Spring;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({StudentProperties.class, AuthorProperties.class})
//@ConfigurationPropertiesScan // 위에는 지정해주고 이거는 자기 하위 다 스캔해서 찾음 ??
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(DemoApplication.class);
		springApplication.run(args);
		springApplication.setBannerMode(Banner.Mode.OFF);
//		SpringApplication.run(DemoApplication.class, args);
	}

}
