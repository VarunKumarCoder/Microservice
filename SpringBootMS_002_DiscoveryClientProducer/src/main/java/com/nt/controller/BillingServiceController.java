package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceController {
	@GetMapping("/info")
		public String getBillingInfo() {
			return "We accept CardPayment, UPI Payment, NetBanking....";
		}
}
