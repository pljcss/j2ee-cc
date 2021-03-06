package com.aopdemo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: cs
 * @Date: 2021/2/1 11:34 上午
 * @Desc:
 */
@Component
@Aspect
@Order(1)
public class UserProxy2 {

    @Before(value = "execution(* com.aopdemo.aop.User.add(..))")
    public void before() {
        System.out.println("UserProxy2 也对 User的add()方法增强了");
    }
}
