package com.example.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.InventoryItem;
import com.example.service.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping(path="/inventory/{code}", produces="application/json")
	public InventoryItem getInventoryByProductionCode(@PathVariable("code") String code)
	{
		return inventoryService.getInventoryByProductionCode(code);
	}
	
	@GetMapping(path="/inventory", produces="application/json")
	public List<InventoryItem> getInventory()
	{
		return inventoryService.getInventory();
	}
	
	@GetMapping(path="/inventory/id/{id}", produces="application/json")
	public InventoryItem getInventoryId(@PathVariable("id") long id)
	{
		return inventoryService.getInventoryById(id);
	}
	
}
