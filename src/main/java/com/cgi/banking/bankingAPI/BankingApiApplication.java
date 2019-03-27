package com.cgi.banking.bankingAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cgi.banking.bankingApI")
@EntityScan(basePackages ="com.cgi.banking.bankingAPI.*")
@EnableDiscoveryClient
public class BankingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingApiApplication.class, args);
	}

}
