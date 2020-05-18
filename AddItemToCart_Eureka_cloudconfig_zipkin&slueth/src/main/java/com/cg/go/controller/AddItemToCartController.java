package com.cg.go.controller;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.dto.CartDTO;
import com.cg.go.service.AddItemToCartServiceImpl;



@RestController
@RequestMapping("/Cart")
@CrossOrigin("http://localhost:4200")
public class AddItemToCartController {
	
	@Autowired
	private AddItemToCartServiceImpl service;
	
	public AddItemToCartServiceImpl getService() {
		return service;
	}

	public void setService(AddItemToCartServiceImpl service) {
		this.service = service;
	}
	//addItem to cart method is used to add items into the cart, 
    //as per the documentation for adding item into cart table is provided with 3 different columns
   //entity class for the below method is CartDTO with entities userId,productId and quantity
	@PostMapping("/AddToCart")
	public String addItemToCart(@RequestBody CartDTO cart) {
		if ((service.addItemToCart(cart))!=null) {
			return "Added Sucessfully";
		} else
			return "Unsucessful";
	}
    
}

