package com.example.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.Order;

@Repository
public interface OrderServiceDao extends JpaRepository<Order,Long> {

	  
	
}
