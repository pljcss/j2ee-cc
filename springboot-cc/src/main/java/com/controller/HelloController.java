package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: cs
 * @Date: 2021/2/4 12:17 上午
 * @Desc:
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello() {
        return "hello world";
    }
}
