package com.nt.clent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("/Billing-Service")
public interface IBillingServiceRestConsumer {
	
	@GetMapping("/billing/api/info")
	public String fetchBillDetails();

}
