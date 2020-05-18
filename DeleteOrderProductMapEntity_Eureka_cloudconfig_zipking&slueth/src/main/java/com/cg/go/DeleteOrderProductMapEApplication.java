package com.cg.go;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DeleteOrderProductMapEApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeleteOrderProductMapEApplication.class, args);
	}
//	@Bean
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//		
//	}

}
