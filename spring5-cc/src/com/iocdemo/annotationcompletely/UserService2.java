package com.iocdemo.annotationcompletely;

import org.springframework.stereotype.Service;

/**
 * @Author: cs
 * @Date: 2021/1/28 12:48 下午
 * @Desc:
 */
@Service
public class UserService2 {
    public void add() {
        System.out.println("service add...");
    }
}
