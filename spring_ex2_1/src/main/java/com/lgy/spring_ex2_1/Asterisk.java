package com.lgy.spring_ex2_1;

public class Asterisk {
	private int n;
	
	public void process() {
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
