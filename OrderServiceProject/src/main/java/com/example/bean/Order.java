package com.example.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="OrderTable")
public class Order {

	@Id
	private long id;
	private String customerEmail;
	private String customerAddress;
	@OneToMany(cascade = CascadeType.ALL)
	List<OrderItem> item;
	public Order() {
		super();
	}
	public Order(long id, String customerEmail, String customerAddress, List<OrderItem> item) {
		super();
		this.id = id;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.item = item;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public List<OrderItem> getItem() {
		return item;
	}
	public void setItem(List<OrderItem> item) {
		this.item = item;
	}
	
	
	
}
