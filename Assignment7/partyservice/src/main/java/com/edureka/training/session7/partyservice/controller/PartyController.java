package com.edureka.training.session7.partyservice.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.training.session7.partyservice.dto.Party;

@RestController
public class PartyController {
	public static HashMap<String, Party> map = new HashMap<>();

	static {
		map.put("123", new Party("aaaa", "aaaaaa"));
		map.put("456", new Party("a111aaa", "aaaaaa"));
		map.put("789", new Party("aa2222aa", "aaaaaa"));
	}

	@RequestMapping(value = "/party")
	@GetMapping
	public Party getPartyDetails(@RequestHeader String accountNumber) {
		return map.get(accountNumber);
	}
}
