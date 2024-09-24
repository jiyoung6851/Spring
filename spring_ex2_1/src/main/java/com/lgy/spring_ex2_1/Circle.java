package com.lgy.spring_ex2_1;

public class Circle {
	private int r;

	public void CircleArea() {
		System.out.println("원의 면적은 "+(Math.PI*(r*r)));;
	}
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
}
