package com.cg.go.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.go.dto.CartDTO;


public interface AddItemToCartDao extends JpaRepository<CartDTO, String> {

}

