package com.cg.go.dao;

import static org.junit.Assert.*;


import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



@SpringBootTest
public class DeleteOrderTest{
	@Test
	public void deleteOrderProductMapEntity() throws URISyntaxException
	{
		RestTemplate rest=new RestTemplate();
		final String baseUrl ="http://localhost:1657/order/DeleteOrderProductMapEntity/o1";
		URI uri = new URI(baseUrl);
		ResponseEntity<String> result=rest.exchange(uri, HttpMethod.DELETE,null,String.class);
		assertEquals(200, result.getStatusCodeValue());
	}
	
}

