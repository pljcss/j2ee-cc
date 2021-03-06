package com.aopdemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: cs
 * @Date: 2021/2/1 9:38 上午
 * @Desc:
 */
@Component
@Aspect
@Order(3)
public class UserProxy {

    /**
     * 提取公共切入点
     */
    @Pointcut(value = "execution(* com.aopdemo.aop.User.add(..))")
    public void pointcut() {
    }


    /**
     * 前置通知
     * Before注解表示前置通知
     */
//    @Before(value = "execution(* com.aopdemo.aop.User.add(..))")
    @Before(value = "pointcut()")
    public void before() {
        System.out.println("UserProxy before....");
    }

    @After(value = "execution(* com.aopdemo.aop.User.add(..))")
    public void after() {
        System.out.println("after....");
    }

    @AfterReturning(value = "execution(* com.aopdemo.aop.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning....");
    }

    @AfterThrowing(value = "execution(* com.aopdemo.aop.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing....");
    }

    /**
     * 环绕通知
     */
    @Around(value = "execution(* com.aopdemo.aop.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前....");

        // 被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后....");
    }



}
