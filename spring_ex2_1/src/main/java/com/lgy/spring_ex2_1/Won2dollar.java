package com.lgy.spring_ex2_1;

public class Won2dollar {
	private double won;

	public void W_dollar() {
		System.out.println("$"+(won/1200));
	}
	
	public double getWon() {
		return won;
	}
	
	public void setWon(double won) {
		this.won = won;
	}
	
}
