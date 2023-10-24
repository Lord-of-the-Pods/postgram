package com.social.postgram.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("@annotation(Log)")
    public void logPointcut(){
        System.out.println("inside log pointcut");
    }

    @Before("logPointcut()")
    public void logAllMethodCallsAdvice(){
        System.out.println("Before Calling Service Aspect");
    }

    @After("logPointcut()")
    public void logAfterMethodCallsAdvice(){
        System.out.println("After Calling Service Aspect");
    }
}
