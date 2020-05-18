package com.cg.go.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.go.dto.OrderProductMapDTO;
import com.cg.go.exceptions.OrderIdNotFoundException;
import com.cg.go.service.OrderServiceImpl;

@RestController
@RequestMapping("/Order")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {


	@Autowired
	private OrderServiceImpl service;

	public OrderServiceImpl getService() {
		return service;
	}

	public void setService(OrderServiceImpl service) {
		this.service = service;
	}

//this method will fetch the data from OrderProductMapDTO table according to the orderId selected
	@GetMapping("/DeleteOrderProductMapEntityDetails/{orderId}")
	public List<OrderProductMapDTO> getDeleteByOrderIdDetails(@PathVariable("orderId") String orderId) throws OrderIdNotFoundException
    { if (service.getDeleteByOrderIdDetails(orderId)==null) {
    	throw new OrderIdNotFoundException("Enter Valid Order Id");
		  }
 else
 	return service.getDeleteByOrderIdDetails(orderId);
	  }
//Exception
@ExceptionHandler(OrderIdNotFoundException.class) public ResponseEntity<String>
userNotFound(OrderIdNotFoundException e) { return new
ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND); }

}
