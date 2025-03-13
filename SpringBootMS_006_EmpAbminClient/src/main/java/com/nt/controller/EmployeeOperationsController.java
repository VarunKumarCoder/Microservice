package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeOperationsController {

	@Value("${dbuser}")
	private String user;
	@Value("${dbpass}")
	private String pass;
	
	public String showData() {
		return "data collected from config server is::"+user+"___"+pass;
	}
}
