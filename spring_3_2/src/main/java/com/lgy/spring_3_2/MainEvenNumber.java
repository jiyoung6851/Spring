package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEvenNumber {
	public static void main(String[] args) {
		String configLoc = "classpath:evenNumberCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyEvenNumber myEvenNumber = ctx.getBean("myevenNumber", MyEvenNumber.class);
		
		myEvenNumber.pc();
	}
}
