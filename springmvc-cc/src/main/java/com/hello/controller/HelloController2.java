package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: cs
 * @Date: 2021/2/7 11:10 下午
 * @Desc:
 */
@Controller
public class HelloController2 {

    @RequestMapping("/aa")
    public void test() {
        System.out.println("hello mvc");
    }
}
