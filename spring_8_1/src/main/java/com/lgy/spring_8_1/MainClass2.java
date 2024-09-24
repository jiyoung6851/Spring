package com.lgy.spring_8_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass2 {
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		
		Professor professor = ctx.getBean("professor", Professor.class);
		professor.getProfessorInfo();
		
		Singer singer = ctx.getBean("singer", Singer.class);
		singer.getSingerInfo();
	}
}
