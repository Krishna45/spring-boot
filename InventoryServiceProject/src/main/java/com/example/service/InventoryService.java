package com.example.service;

import java.util.List;

import com.example.bean.InventoryItem;

public interface InventoryService {

	
	public InventoryItem getInventoryByProductionCode(String code);
	public List<InventoryItem> getInventory();
	public InventoryItem getInventoryById(long id);
}
