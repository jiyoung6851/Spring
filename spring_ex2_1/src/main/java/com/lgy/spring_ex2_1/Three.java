package com.lgy.spring_ex2_1;

public class Three {
	private int n;

	public void process() {
		if(n%3 == 0) {
			System.out.println(n+"은 3의 배수입니다.");
		}else {
			System.out.println(n+"은 3의 배수가 아닙니다.");
		}
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}
