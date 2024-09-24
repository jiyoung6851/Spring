package com.lgy.spring_6_4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainSinger {
	public static void main(String[] args) {
		String configLoc = "classpath:singerCTX.xml";
		String configLoc2 = "classpath:singerCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc, configLoc2);
		
		Singer singer1 = ctx.getBean("singer1", Singer.class);
		System.out.println(singer1.getName());
		System.out.println(singer1.getMember());
		System.out.println(singer1.getSong());
		System.out.println("=======================================================");
		
		SingerInfo singerInfo = ctx.getBean("singerInfo1", SingerInfo.class);
		Singer singer2 = singerInfo.getSinger();
		System.out.println(singer2.getName());
		System.out.println(singer2.getMember());
		System.out.println(singer2.getSong());
		System.out.println("=======================================================");
		
		Singer singer3 = ctx.getBean("singer3", Singer.class);
		System.out.println(singer3.getName());
		System.out.println(singer3.getMember());
		System.out.println(singer3.getSong());
		System.out.println("=======================================================");
		
		
	}
}
