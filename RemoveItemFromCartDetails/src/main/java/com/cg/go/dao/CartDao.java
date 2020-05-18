package com.cg.go.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.go.dto.CartDTO;

public interface CartDao extends JpaRepository<CartDTO, String> {
	
	
	@Query("select c from  CartDTO c where c.userId=?1")
	public  List<CartDTO> findByUserId(String userId);

}