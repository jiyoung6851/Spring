package com.lgy.spring_ex2_1;

public class Rectangle {
	private int x;
	private int y;

	public void RectangleArea() {
		System.out.println("사각형의 넓이는 "+(x*y));
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
