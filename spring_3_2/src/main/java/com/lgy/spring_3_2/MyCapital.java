package com.lgy.spring_3_2;

public class MyCapital {
	private Capital capital;
	private char end;
	
	public void alpha() {
		capital.alphabet(end);
	}
	
	public Capital getCapital() {
		return capital;
	}
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	public char getEnd() {
		return end;
	}
	public void setEnd(char end) {
		this.end = end;
	}
}
