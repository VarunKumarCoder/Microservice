package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class displayMessage {
		@GetMapping("/display")
			public String displayMessage() {
				return "Welcome to Flipkart search Service";
			}
}
