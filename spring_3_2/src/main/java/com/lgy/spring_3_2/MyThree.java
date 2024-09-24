package com.lgy.spring_3_2;

public class MyThree {
	private Three three;
	private int n;
	
	public void pc() {
		three.process(n);
	}
	
	public Three getThree() {
		return three;
	}
	public void setThree(Three three) {
		this.three = three;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}
