package com.cg.go.service;

import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.dao.AddItemToCartDao;
import com.cg.go.dto.CartDTO;

@Service
@Transactional
public class AddItemToCartServiceImpl implements AddItemToCartService{

    @Autowired
    private AddItemToCartDao dao;

    public AddItemToCartDao getDao(){
        return dao;
    }
 
 //this is service method where we are calling Dao object 
//and using the JpaRepository method (save method) to add the data in the database  
	@Override
	public Object addItemToCart(CartDTO cart) {
		// Adding to cart
		CartDTO addtocart = dao.save(cart);
		if (addtocart != null)
			return true;
		else
			return false;
	}

}

