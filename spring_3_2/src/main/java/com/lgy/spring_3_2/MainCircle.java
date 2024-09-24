package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCircle {
	public static void main(String[] args) {
		String configLoc = "classpath:circleCTX.xml"; 
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyCircle mycircle = ctx.getBean("mycircle", MyCircle.class);
		
		mycircle.ar();
	}
}
