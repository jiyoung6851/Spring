package com.lgy.spring_8_1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop2 {
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
//		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println("@@@### start ===> "+joinPoint.getSignature().toShortString());
		Object obj = null;
		
		try {
			obj = joinPoint.proceed();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("@@@### end ===> "+joinPoint.getSignature().toShortString());
		}
		return obj;
	}
}