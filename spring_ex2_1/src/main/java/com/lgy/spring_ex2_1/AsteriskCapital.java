package com.lgy.spring_ex2_1;

public class AsteriskCapital {
	public static void main(String[] args) {
		Asterisk asterisk = new Asterisk();
		asterisk.setN(5);
		asterisk.process();
		
		Capital capital = new Capital();
		capital.setEnd('F');
		capital.process();
	}
}
