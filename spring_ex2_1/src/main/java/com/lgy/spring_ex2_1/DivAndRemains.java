package com.lgy.spring_ex2_1;

public class DivAndRemains {
	private int n;
	
	public void process() {
		int ten = n/10;
		int one = n%10;
		
		if(ten == one) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}
