package com.lgy.spring_3_2;

public class EvenNumber {
	public void process(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if(i%2 == 0) {
				sum = sum+i;
			}
		}
		System.out.println(n+"까지의 짝수들의 합계는 : "+sum);
	}
}
