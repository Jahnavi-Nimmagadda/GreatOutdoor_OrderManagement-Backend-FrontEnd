package com.cg.go.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.exceptions.ProductIdNotFoundException;
import com.cg.go.service.RemoveItemServiceImpl;



@RestController
@RequestMapping("/Cart")
@CrossOrigin("http://localhost:4200")
public class RemoveItemFromCartController {


	@Autowired
	private RemoveItemServiceImpl cartservice;

	public RemoveItemServiceImpl getService() {
		return cartservice;
	}
	
//this method will delete the corresponding data from OrderProductMapDTO table according to the productId selected
//particular productId is deleted based on the userId
	
@DeleteMapping("/RemoveItemFromCart/{productId}/{userId}")
public String removeItemFromCart(@PathVariable("productId") String productId,@PathVariable("userId") String userId) throws ProductIdNotFoundException {
	if ((cartservice.removeItemFromCart(productId, userId))==true) {
		return "removed the Item from cart Sucessfully";
	  }
else
	throw new ProductIdNotFoundException("Enter Valid Order Id");
}
//Exception
@ExceptionHandler(ProductIdNotFoundException.class) public ResponseEntity<String>
userNotFound(ProductIdNotFoundException e) { return new
ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND); }
}
