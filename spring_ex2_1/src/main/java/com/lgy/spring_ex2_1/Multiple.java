package com.lgy.spring_ex2_1;

public class Multiple {
	private int n;
	boolean multiple = false;
	
	public void process() {
		int[] arr =	{3,5,8};
		
		for (int i = 0; i < arr.length; i++) {
			if(n%arr[i]==0) {
				System.out.println(arr[i]+"의 배수이다.");
				multiple = true;
			}
		}
		if(!multiple) {
			System.out.println("어느 배수도 아니다.");
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
