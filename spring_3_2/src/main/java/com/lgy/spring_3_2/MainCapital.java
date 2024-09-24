package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCapital {
	public static void main(String[] args) {
		String configLoc = "classpath:capitalCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyCapital mycapital = ctx.getBean("mycapital", MyCapital.class);
		
		mycapital.alpha();
	}
}
