package com.lgy.spring_3_2;

public class MyWon2Dollar {
	private Won2Dollar won2dollar;
	private int won;
	
	public void exch() {
		won2dollar.exchange(won);
	}

	public Won2Dollar getWon2dollar() {
		return won2dollar;
	}

	public void setWon2dollar(Won2Dollar won2dollar) {
		this.won2dollar = won2dollar;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}
	
}
