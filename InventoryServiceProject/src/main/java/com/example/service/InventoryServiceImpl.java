package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.InventoryItem;
import com.example.persistence.InventoryDao;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryDao inventoryDao;
	
	@Override
	public InventoryItem getInventoryByProductionCode(String code) {
		
		Optional<InventoryItem> op=Optional.ofNullable(inventoryDao.findInventoryByProductionCode(code));
		InventoryItem item=null;
		if(op.isPresent())
			item=op.get();
		return item;
		
	}

	@Override
	public List<InventoryItem> getInventory() {
		
		return inventoryDao.findAll();
		
	}

	@Override
	public InventoryItem getInventoryById(long id) {
	    
		Optional<InventoryItem> op=inventoryDao.findById(id);
		InventoryItem item=null;
		if(op.isPresent())
			item=op.get();
		return item;
		
	}

}
