package com.cg.go.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.dto.CartDTO;
import com.cg.go.exceptions.UserIdNotFoundException;
import com.cg.go.service.CartServiceImpl;

@RestController
@RequestMapping("/Order")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
	
	@Autowired
	private CartServiceImpl service;

	public CartServiceImpl getService() {
		return service;
	}

	public void setService(CartServiceImpl service) {
		this.service = service;
	}

//this method will fetch the data from CartDTO table according to the userId selected
	
	@GetMapping("/RemoveItemFromCartDetails/{userId}")
	public List<CartDTO> getDeleteByOrderIdDetails(@PathVariable("userId") String userId)
    {  if (service.getDeleteByOrderIdDetails(userId)==null) { 
		  throw new UserIdNotFoundException("Enter Valid User Id"); 
		  }
    else
	   return  service.getDeleteByOrderIdDetails(userId);
	  }
	  
	  //Exception
	  @ExceptionHandler(UserIdNotFoundException.class) public ResponseEntity<String>
	  userNotFound(UserIdNotFoundException e) { return new
	  ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND); }
}

