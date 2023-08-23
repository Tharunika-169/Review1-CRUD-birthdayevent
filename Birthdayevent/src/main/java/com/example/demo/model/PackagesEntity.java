package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TotalPackages")
public class PackagesEntity {
	
	@Id
	private int theme;
	private int foodstall;
	private int cake;
	private int partyhall;
	public PackagesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PackagesEntity(int theme, int foodstall, int cake, int partyhall) {
		super();
		this.theme = theme;
		this.foodstall = foodstall;
		this.cake = cake;
		this.partyhall = partyhall;
	}
	public int getTheme() {
		return theme;
	}
	public void setTheme(int theme) {
		this.theme = theme;
	}
	public int getFoodstall() {
		return foodstall;
	}
	public void setFoodstall(int foodstall) {
		this.foodstall = foodstall;
	}
	public int getCake() {
		return cake;
	}
	public void setCake(int cake) {
		this.cake = cake;
	}
	public int getPartyhall() {
		return partyhall;
	}
	public void setPartyhall(int partyhall) {
		this.partyhall = partyhall;
	}
	
	
	
	

}
