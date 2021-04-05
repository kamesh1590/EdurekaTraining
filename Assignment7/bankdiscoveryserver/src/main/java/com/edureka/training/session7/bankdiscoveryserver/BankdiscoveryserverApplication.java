package com.edureka.training.session7.bankdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankdiscoveryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankdiscoveryserverApplication.class, args);
	}

}
