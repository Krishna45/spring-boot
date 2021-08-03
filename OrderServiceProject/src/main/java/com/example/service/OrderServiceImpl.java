package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Order;
import com.example.persistence.OrderServiceDao;

@Service
public class OrderServiceImpl implements OrderService {

	
	  @Autowired private OrderServiceDao osDao;
	  
	  @Override 
	  public Order createOrder(Order order) {
	  
	       return osDao.save(order);
	  
	  }
	  
	  @Override
	  public Order findOrderById(long id) {
	  
		  Optional<Order> op=osDao.findById(id);
		  Order order=null;
		  if(op.isPresent())
			  order=op.get();
		  return order;
		  
	  }
	 

	
	
}
