package com.lgy.spring_3_2;

public class Capital {
	public void alphabet(char end) {
		for (char i = end; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
