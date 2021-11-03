package com.linge.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.linge.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("----3-----方法执行前-----3----");
    }

    @After("execution(* com.linge.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("-----3----方法执行后-----3----");
    }

    @Around("execution(* com.linge.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");
        System.out.println(pjp.getSignature()); //打印签名
        Object proceed = pjp.proceed();//执行方法
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
