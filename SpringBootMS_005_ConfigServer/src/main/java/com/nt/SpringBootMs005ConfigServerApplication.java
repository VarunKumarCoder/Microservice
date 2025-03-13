package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootMs005ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMs005ConfigServerApplication.class, args);
	}

}
