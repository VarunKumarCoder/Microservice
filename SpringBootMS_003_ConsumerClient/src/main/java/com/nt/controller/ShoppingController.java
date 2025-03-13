package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.clent.IBillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingController {
	@Autowired
	private IBillingServiceRestConsumer consumer;
	
	@GetMapping("/details")
	public String displayShoppingDetails() {
		System.out.println("ShoppingController:: Client Component Class Name::"+consumer.getClass());
		return "Pongal Shopping forFamily..."+consumer.fetchBillDetails();
	}

}
