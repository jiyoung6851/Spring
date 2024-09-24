package com.lgy.spring_9_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass2 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX2.xml");
		
		Car car = ctx.getBean("car", Car.class);
		car.getCarInfo();
		
		Graphic graphic = ctx.getBean("graphic", Graphic.class);
		graphic.getGraphicInfo();
	}
}
