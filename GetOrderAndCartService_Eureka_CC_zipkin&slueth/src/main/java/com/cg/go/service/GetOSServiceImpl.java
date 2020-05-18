package com.cg.go.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.dao.GetOrderStatusDao;
import com.cg.go.dto.OrderDTO;

@Service
@Transactional
public class GetOSServiceImpl implements GetOS {
	@Autowired
	private GetOrderStatusDao dao;

	public GetOrderStatusDao getDao() {
		return dao;
	}
//this is service method where we are calling Dao object 
//and using the findByUserId method declared in Dao class to get the data from the database by userId  
	 
	@Override
	public List<OrderDTO> getOrderAndCartService(String userId) {

		return dao.findByUserId(userId);
	}

}
