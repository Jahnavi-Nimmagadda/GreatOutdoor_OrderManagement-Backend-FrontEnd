package com.cg.go.service;


import java.util.List;

import com.cg.go.dto.CartDTO;

public interface CartService {



	List<CartDTO> getDeleteByOrderIdDetails(String orderId);

}
