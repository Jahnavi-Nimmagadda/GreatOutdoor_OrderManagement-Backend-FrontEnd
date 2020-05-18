package com.cg.go.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.exceptions.OrderIdNotFoundException;
import com.cg.go.service.DeleteOrderProductMapServiceImpl;
@RestController
@RequestMapping("/order")
@CrossOrigin(origins="http://localhost:4200")
public class DeletOrderProductMApController {
	

	@Autowired
	private DeleteOrderProductMapServiceImpl service;

	public DeleteOrderProductMapServiceImpl getService() {
		return service;
	}
//this method will delete the corresponding data from OrderProductMapDTO table according to the orderId selected
@DeleteMapping("/DeleteOrderProductMapEntity/{orderId}")
public String deleteOrderProductMapEntity(@PathVariable("orderId") String orderId) throws OrderIdNotFoundException  {
	if ((service.deleteOrderProductMapEntity(orderId))) {
			   return "cancelled order successfully";
			  }
	    else
	    	throw new OrderIdNotFoundException("Enter Valid Order Id");
		  }
	 //Exception
	  @ExceptionHandler(OrderIdNotFoundException.class) public ResponseEntity<String>
	  userNotFound(OrderIdNotFoundException e) { return new
	  ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND); }

}
