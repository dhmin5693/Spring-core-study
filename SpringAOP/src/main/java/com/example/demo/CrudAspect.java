package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CrudAspect {

    @Around("@annotation(com.example.demo.Clock)")
    public Object timeMeasure(ProceedingJoinPoint joinPoint) throws Throwable {
        long begin = System.currentTimeMillis();
        Object ret = joinPoint.proceed();
        System.out.println("걸린 시간 : " + (System.currentTimeMillis() - begin) + " ms");
        return ret;
    }

    @Before("bean(crudService)")
    public void beforeExecute() {
        System.out.println("This is CRUD!");
    }
}