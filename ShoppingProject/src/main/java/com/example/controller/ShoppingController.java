package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bean.Shopping;
import com.example.service.ShoppingService;

@Controller
public class ShoppingController {

	@Autowired
	private ShoppingService s;
	
	@RequestMapping(path="/display")
	public ModelAndView displayAllProducts()
	{
		List<Shopping> list=s.getAllProducts();
		return new ModelAndView("output","list",list);
	}
	
	
}
