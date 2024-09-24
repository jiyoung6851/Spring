package com.lgy.spring_6_4;

import java.util.ArrayList;

public class Nasdaq {
	private String stock;
 	private	int carrank;
	private ArrayList<String> product;
	
	public Nasdaq(String stock) {
		super();
		this.stock = stock;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public int getCarrank() {
		return carrank;
	}
	public void setCarrank(int carrank) {
		this.carrank = carrank;
	}
	public ArrayList<String> getProduct() {
		return product;
	}
	public void setProduct(ArrayList<String> product) {
		this.product = product;
	}
}
