package com.lgy.spring_ex2_1;

public class Capital {
	private char end;

	public void process() {
		for (char i = end; i >= 'A' ; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public char getEnd() {
		return end;
	}
	
	public void setEnd(char end) {
		this.end = end;
	}
}
