package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainRectangle2 {
	public static void main(String[] args) {
		String configLoc = "classpath:rectangle2CTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyRectangle2 myrectangle2 = ctx.getBean("myrectangle2", MyRectangle2.class);
		myrectangle2.pc();
	}
}
