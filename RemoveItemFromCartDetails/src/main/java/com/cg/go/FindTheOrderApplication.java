package com.cg.go;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class FindTheOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run( FindTheOrderApplication.class, args);
	}

}
