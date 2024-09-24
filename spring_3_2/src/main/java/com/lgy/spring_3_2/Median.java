package com.lgy.spring_3_2;

public class Median {
	public void process(int a, int b, int c) {
		
		if(a>b && a>c && b>c || c>a && c>b && a<b) {
			System.out.println(b);
		}else if(a>b && a>c && b<c || b>a && b>c && a<c) {
			System.out.println(c);
		}else if(b>a && b>c && a>c || c>a && c>b && a>b) {
			System.out.println(a);
		}
	}
}
