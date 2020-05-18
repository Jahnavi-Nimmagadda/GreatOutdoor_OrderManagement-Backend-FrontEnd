package com.cg.go.service;

import java.util.Optional;


import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.dao.DeleteOrderProductMapDao;
import com.cg.go.dto.OrderProductMapDTO;


  @Service
	@Transactional
	public class DeleteOrderProductMapServiceImpl implements DeleteOrderProductMapService {
		 
		  
		  @Autowired
		    private DeleteOrderProductMapDao dao;

		    public DeleteOrderProductMapDao getDao(){
		        return dao;
		    }
//this is service method where we are calling Dao object 
//and using the findByOrderId method from JpaRepository to know whether that id exists or not 
//after finding orderId deleteById method is implemented to delte that particular order
		    @Override
			public boolean deleteOrderProductMapEntity(String orderId) {
				Optional<OrderProductMapDTO> findOrder= dao.findById(orderId);
				if (findOrder!=null) {
					dao.deleteById(orderId);
					return true;
				} else
					return false;

			}

		
	}
