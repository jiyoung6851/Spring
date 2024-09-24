package com.lgy.spring_3_2;

public class Three {
	public void process(int n) {
		if(n%3 ==0) {
			System.out.println("입력된 수 : "+n+"는 3의 배수입니다.");
		}else {
			System.out.println("입력된 수 : "+n+"는 3의 배수가 아닙니다.");
		}
	}
}
