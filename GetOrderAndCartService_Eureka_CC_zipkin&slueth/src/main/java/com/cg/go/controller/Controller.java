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

import com.cg.go.dto.OrderDTO;
import com.cg.go.exceptions.UserIdNotFoundException;
import com.cg.go.service.GetOSServiceImpl;

@RestController
@RequestMapping("/order")
@CrossOrigin("http://localhost:4200")
public class Controller {

	@Autowired
	private GetOSServiceImpl service;

	public GetOSServiceImpl  getService() {
		return service;
	}
	public void setService(GetOSServiceImpl service) {
		this.service = service;
	}	
//this method will fetch the data from OrderDTO table according to the userId selected
	@GetMapping("/GetOrderAndCartService/{userId}")
	public List<OrderDTO> getOrderAndCartService(@PathVariable("userId") String userId) {
		    if (service.getOrderAndCartService(userId)==null) { 
			  throw new UserIdNotFoundException("Enter Valid User Id"); 
			  }
	    else
		   return  service.getOrderAndCartService(userId);
		  }
	 //Exception
	  @ExceptionHandler(UserIdNotFoundException.class) public ResponseEntity<String>
	  userNotFound(UserIdNotFoundException e) { return new
	  ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND); }
}
		  
	

