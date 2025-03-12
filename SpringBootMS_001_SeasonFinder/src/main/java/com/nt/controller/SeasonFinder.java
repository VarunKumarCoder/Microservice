package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season")
public class SeasonFinder {
	@Value("${spring.application.instance-id}")
		private String instance_id;
	
	@GetMapping("/finder")
	public ResponseEntity<String> findSeason(){
		LocalDateTime ldt=LocalDateTime.now();
		int month=ldt.getMonthValue();
		String seasonName=null;
		if(month>=7 &&month<=10)
			seasonName="Rainy Season";
		else if(month>=3 &&month<=6)
			seasonName="summer season";
		else
			seasonName="Winter Season";
		seasonName=seasonName+"------"+instance_id;
		return new ResponseEntity<String>(seasonName,HttpStatus.OK);
		
	}
}
