package com.web;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class BankingManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingManagementSystemApplication.class, args);
	}

}