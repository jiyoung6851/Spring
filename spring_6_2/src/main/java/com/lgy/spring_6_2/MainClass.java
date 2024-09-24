package com.lgy.spring_6_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext 클래스로 자바 스프링 설정파일 가져옴
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student1 = ctx.getBean("student1", Student.class);
//		홍길동 객체정보 가져옴
		System.out.println("이름: "+student1.getName());
		System.out.println("나이: "+student1.getAge());
		System.out.println("취미: "+student1.getHobbys());
		System.out.println("신장: "+student1.getHeight());
		System.out.println("몸무게: "+student1.getWeight());
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println("이름: "+student2.getName());
		System.out.println("나이: "+student2.getAge());
		System.out.println("취미: "+student2.getHobbys());
		System.out.println("신장: "+student2.getHeight());
		System.out.println("몸무게: "+student2.getWeight());
		
		
		ctx.close();
	}
}
