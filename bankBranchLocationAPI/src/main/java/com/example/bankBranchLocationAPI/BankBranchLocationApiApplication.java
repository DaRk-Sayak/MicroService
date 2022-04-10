package com.example.bankBranchLocationAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BankBranchLocationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankBranchLocationApiApplication.class, args);
	}

}
