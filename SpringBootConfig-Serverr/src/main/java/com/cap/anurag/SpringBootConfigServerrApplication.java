package com.cap.anurag;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class SpringBootConfigServerrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigServerrApplication.class, args);
	}
}
