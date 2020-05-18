package com.cg.go.service;

import java.util.List;

import com.cg.go.dto.OrderDTO;



public interface GetOS {
	
	List<OrderDTO> getOrderAndCartService(String userId);
}
