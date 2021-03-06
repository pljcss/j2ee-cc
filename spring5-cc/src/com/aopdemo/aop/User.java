package com.aopdemo.aop;

import org.springframework.stereotype.Component;

/**
 * @Author: cs
 * @Date: 2021/2/1 9:37 上午
 * @Desc:
 */
@Component
public class User {
    public void add() {
        System.out.println("User...add()...");
    }
}
