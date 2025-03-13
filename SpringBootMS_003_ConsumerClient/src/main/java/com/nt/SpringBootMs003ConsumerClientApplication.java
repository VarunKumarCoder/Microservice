package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringBootMs003ConsumerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMs003ConsumerClientApplication.class, args);
	}

}
