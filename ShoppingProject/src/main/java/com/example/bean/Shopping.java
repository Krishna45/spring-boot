package com.example.bean;

public class Shopping {

	private long id;
	private String code;
	private String name;
	private String description;
	private double price;
	private String productionCode;
	private int availabelQuantity;
	
	
	public Shopping() {
		super();
		
	}
	
	public Shopping(long id, String code, String name, String description, double price, String productionCode,
			int availabelQuantity) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.price = price;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
