package com.cg.go.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.dao.OrderProductMapDao;
import com.cg.go.dto.OrderProductMapDTO;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {


	@Autowired
	private OrderProductMapDao pdao;

	public OrderProductMapDao getDao1() {
		return pdao;
	}
	 //this is service method where we are calling Dao object 
//and using the findByOrderId method declared in dao class to get the data from the database by orderId  
    @Override
public List<OrderProductMapDTO>  getDeleteByOrderIdDetails(String orderId) {

return  pdao.findByOrderId(orderId);
			}

}
