package com.cc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cs
 * @Date: 2021/2/19 1:51 下午
 * @Desc:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello world";
    }



    @RequestMapping("/index")
    public String mainPage(Model model) {

        // model中的数据会被放到请求域中，相当于 request.setAttribute("a", "aa")
        model.addAttribute("hello", "hello world");
        return "index";
    }

}
