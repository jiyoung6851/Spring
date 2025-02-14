package com.lgy.spring_7_3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
//		student1 -> student(홍길순) 가리킴
		Student student1 = ctx.getBean("student", Student.class);
		System.out.println("이름: "+student1.getName());
		System.out.println("나이: "+student1.getAge());
		System.out.println("========================================");
		
//		student2 -> student(홍길순 -> 짱구) 가리킴
		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("짱구");
		student2.setAge(100);
		System.out.println("이름: "+student2.getName());
		System.out.println("나이: "+student2.getAge());
		System.out.println("========================================");
		
//		student1 -> student(홍길순 -> 짱구) 가리킴
		System.out.println("이름: "+student1.getName());
		System.out.println("나이: "+student1.getAge());
		System.out.println("========================================");
		
//		student1 == student2
		if (student1.equals(student2)) {
			System.out.println("student1 == student2");
		} else {
			System.out.println("student1 != student2");
		}
		
		ctx.close();
	}
}
