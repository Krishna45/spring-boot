package com.example.service;

import com.example.bean.Order;

public interface OrderService {

	public Order createOrder(Order order);
	public Order findOrderById(long id);
	
}
