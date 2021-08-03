package com.example.bean;


public class InventoryItem {
	
	private long id;
	private String productionCode;
	private int availabelQuantity;
	public InventoryItem() {
		super();
		
	}
	public InventoryItem(String productionCode, int availabelQuantity) {
		super();
		this.productionCode = productionCode;
		this.availabelQuantity = availabelQuantity;
	}
	public InventoryItem(long id, String productionCode, int availabelQuantity) {
		super();
		this.id = id;
		this.productionCode = productionCode;
		this.availabelQuantity = availabelQuantity;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductionCode() {
		return productionCode;
	}
	public void setProductionCode(String productionCode) {
		this.productionCode = productionCode;
	}
	public int getAvailabelQuantity() {
		return availabelQuantity;
	}
	public void setAvailabelQuantity(int availabelQuantity) {
		this.availabelQuantity = availabelQuantity;
	}
	
	
	
}
