package com.edureka.training.session7.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/account")
	@GetMapping
	public String getAccountDetails(@RequestParam String accountNumber) {
		String response = restTemplate.exchange(
				RequestEntity.get("http://party-service/party").header("accountNumber", accountNumber).build(),
				String.class).getBody();
		return response;
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
