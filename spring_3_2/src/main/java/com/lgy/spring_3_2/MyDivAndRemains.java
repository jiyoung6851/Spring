package com.lgy.spring_3_2;

public class MyDivAndRemains {
	private DivAndRemains divAndRemains;
	private int num;

	public void pc() {
		divAndRemains.process(num);
	}
	
	public DivAndRemains getDivAndRemains() {
		return divAndRemains;
	}
	public void setDivAndRemains(DivAndRemains divAndRemains) {
		this.divAndRemains = divAndRemains;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
