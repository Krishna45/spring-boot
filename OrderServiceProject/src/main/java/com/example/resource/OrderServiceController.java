package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Order;
import com.example.bean.OrderItem;
import com.example.service.OrderService;

@RestController
public class OrderServiceController {

	
	  @Autowired private OrderService os;
	  
	  @PostMapping(path="/order",produces="application/json",consumes="application/json")
	  public Order createOrder(@RequestBody Order order) {
	  
		  return os.createOrder(order);
		  
	  }
	  
	  @GetMapping(path="/order/{id}",produces="application/json") 
	  public Order findOrder(@PathVariable("id") long id) { 
		  
		  return os.findOrderById(id); 
		  
	  }
	 
	
}
