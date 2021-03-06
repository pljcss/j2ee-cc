package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: cs
 * @Date: 2021/2/8 12:00 下午
 * @Desc:
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String test() {
        // 跳转到 hello.jsp
        System.out.println("hello mvc");
        return "hello";
    }
}
