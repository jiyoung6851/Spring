package com.lgy.spring_3_2;

public class MyRectangle2 {
	private Rectangle2 rectangle2;
	private int x;
	private int y;
	public Rectangle2 getRectangle2() {
		return rectangle2;
	}
	
	public void pc() {
		rectangle2.process(x, y);
	}
	
	public void setRectangle2(Rectangle2 rectangle2) {
		this.rectangle2 = rectangle2;
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
