package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainSeason {
	public static void main(String[] args) {
		String configLoc = "classpath:seasonCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MySeason mySeason = ctx.getBean("myseason", MySeason.class);
		
		mySeason.result();
	}
}
