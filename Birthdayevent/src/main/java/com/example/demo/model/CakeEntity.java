package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cake")
public class CakeEntity {

	private String fl;
	private String cust;
	@Id
	private int quantity;
	public CakeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CakeEntity(String fl, String cust, int quantity) {
		super();
		this.fl = fl;
		this.cust = cust;
		this.quantity = quantity;
	}
	public String getFl() {
		return fl;
	}
	public void setFl(String fl) {
		this.fl = fl;
	}
	public String getCust() {
		return cust;
	}
	public void setCust(String cust) {
		this.cust = cust;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
