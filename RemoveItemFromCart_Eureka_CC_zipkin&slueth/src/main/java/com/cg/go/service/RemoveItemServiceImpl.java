package com.cg.go.service;

import java.util.Optional;


import javax.transaction.Transactional;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.dao.RemoveItemFromCart;
import com.cg.go.dto.CartDTO;


  @Service
	@Transactional
	public class RemoveItemServiceImpl implements RemoveItemService {
		 
		  
		  @Autowired
		    private RemoveItemFromCart dao;

		    public RemoveItemFromCart getDao(){
		        return dao;
		    }
		  
//this is service method where we are calling Dao object 
//and using the findById method from JpaRepository to get the data from the database by userId
//then delete required productId from the table of particular userId
		     
			@Override
			public boolean removeItemFromCart(String productId, String userId) {
				Optional<CartDTO> findUser = dao.findById(userId);
				if (findUser != null) {
					dao.deleteById(productId);
					return true;
				} else
					return false;

			}

		
	}
