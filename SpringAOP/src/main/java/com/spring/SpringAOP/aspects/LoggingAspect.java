package com.spring.SpringAOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.spring.SpringAOP.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {
		
		System.out.println("Before calling the method");
	}
	
	@After("execution(* com.spring.SpringAOP.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinPoint) {
		
		System.out.println("After calling the method");
	}
}
