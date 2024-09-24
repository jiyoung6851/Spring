package com.lgy.spring_9_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop2 {
	@Pointcut("within(com.lgy.spring_9_1.*)")
	private void pointCutMethod() {}
	
//	메소드 실행 전/후, 예외처리 포함해서 공통기능 실행
	@Around("pointCutMethod()")//적용되는 메소드명
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println("@@@### start ===> "+signatureStr);
		Object obj = null;

		try {
			obj = joinPoint.proceed();	//예외처리 추가
			return obj;
		}finally {
			System.out.println("@@@### end ===> "+signatureStr);
		}
	}
}
