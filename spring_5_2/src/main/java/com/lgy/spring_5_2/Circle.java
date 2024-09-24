package com.lgy.spring_5_2;

public class Circle {
	private int radius;
	
	public double process() {
		return 3.14*(radius*radius);
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
