package com.lgy.spring_7_2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX.xml");
		ctx.refresh();
		
		ctx.close();
	}
}
//ctx.refresh();
//@# afterPropertiesSet()
//@# destroy()

//.xml에 <context:annotation-config></context:annotation-config> 추가하면
//@PostConstruct, @PreDestroy 2개가 동작됨
//최종순서
//@# afterPropertiesSet()
//@# initMethod()
//@# destroyMethod()
//@# destroy()
