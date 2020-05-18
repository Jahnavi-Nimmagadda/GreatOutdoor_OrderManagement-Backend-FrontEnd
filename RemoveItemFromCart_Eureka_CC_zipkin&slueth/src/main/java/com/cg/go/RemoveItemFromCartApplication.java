package com.cg.go;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class RemoveItemFromCartApplication {

	public static void main(String[] args) {
		SpringApplication.run( RemoveItemFromCartApplication.class, args);
	}
//	@Bean
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//		
//	}

}
