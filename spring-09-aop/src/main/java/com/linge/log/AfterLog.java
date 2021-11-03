package com.linge.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        //returnValue 返回值
        //method被调用的方法
        //args 被调用的方法的对象的参数
        //target 被调用的目标对象

        System.out.println("执行了" + target.getClass().getSimpleName()
                + "的" + method.getName() + "方法，返回值是"
                + returnValue);
    }
}
