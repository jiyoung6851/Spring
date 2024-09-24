package com.lgy.spring_ex2_1;

public class Draw {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		
		circle.setR(10);
		rectangle.setX(20);
		rectangle.setY(30);
		
		circle.CircleArea();
		rectangle.RectangleArea();
	}
}
