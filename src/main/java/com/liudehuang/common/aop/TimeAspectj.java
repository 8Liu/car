package com.liudehuang.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class TimeAspectj {
	@Around("bean(*Controller)")
	public Object test(ProceedingJoinPoint jp) throws Throwable{
		long start = System.currentTimeMillis();
		Object result = jp.proceed();
		long end = System.currentTimeMillis();
		long time = end - start;
		Signature name = jp.getSignature();
		System.out.println(name+":花费了"+time+"毫秒");
		return result;
		
	}
	
	@Before("bean(*Controller)")
	public void before(){
		System.out.println("执行方法之前");
	}
	
	@After("bean(*Controller)")
	public void after(){
		System.out.println("controller方法执行完");
	}
}
