package com.cg.go.service;


import java.util.List;

import com.cg.go.dto.OrderProductMapDTO;

public interface OrderService {



	List<OrderProductMapDTO> getDeleteByOrderIdDetails(String orderId);

}
