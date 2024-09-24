package com.lgy.spring_3_2;

public class MyEvenNumber {
	private EvenNumber evenNumber;
	private int n;
	
	public void pc() {
		evenNumber.process(n);
	}
	
	public EvenNumber getEvenNumber() {
		return evenNumber;
	}
	public void setEvenNumber(EvenNumber evenNumber) {
		this.evenNumber = evenNumber;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}
