package com.mike.back.end.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class UserApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserApiApplication.class, args);
	}

}
