package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainMedian {
	public static void main(String[] args) {
		String configLoc = "classpath:medianCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyMedian mymedian = ctx.getBean("mymedian", MyMedian.class);
		
		mymedian.pc();
	}
}
