package com.lance.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author lancecong
 * @version 1.0
 * @ClassName MyAspectJ
 * @DESCRIPTION TODO
 * @create 2019-12-21 11:57
 **/
@Component
@Aspect
public class MyAspectJ {

	@Pointcut("execution(* com.lance.aop.*.*(..))")
	public void mypoint(){

	}

	@Around("mypoint()")
	public Object aroud (ProceedingJoinPoint point) throws Throwable {
		Object proceed = point.proceed();

		long start = System.currentTimeMillis();
		long cost = System.currentTimeMillis()-start;
		System.out.println("cost  time " +cost);
		return proceed;


	}
}
