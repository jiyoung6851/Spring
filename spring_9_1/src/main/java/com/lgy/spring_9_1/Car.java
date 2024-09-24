package com.lgy.spring_9_1;

public class Car {
	private String company;
	private String product;
	private int caprank;
	
	public void getCarInfo() {
		System.out.println("회사: "+getCompany());
		System.out.println("시총: "+getCaprank());
		System.out.println("제품: "+getProduct());
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getCaprank() {
		return caprank;
	}
	public void setCaprank(int caprank) {
		this.caprank = caprank;
	}
}
