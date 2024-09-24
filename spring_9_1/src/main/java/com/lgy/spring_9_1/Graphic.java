package com.lgy.spring_9_1;

public class Graphic {
	private String company;
	private int caprank;
	
	public void getGraphicInfo() {
		System.out.println("회사: "+getCompany());
		System.out.println("시총: "+getCaprank());
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getCaprank() {
		return caprank;
	}
	public void setCaprank(int caprank) {
		this.caprank = caprank;
	}
}
