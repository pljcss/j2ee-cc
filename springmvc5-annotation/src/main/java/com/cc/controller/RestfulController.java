package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: cs
 * @Date: 2021/2/8 12:43 下午
 * @Desc:
 */
@Controller
public class RestfulController {

    /**
     * 传统方式方式（参数拼接方式）
     *      http://localhost:8080/add?a=1&b=1
     */
    @RequestMapping("/add")
    public String add(int a, int b, Model model) {
        int result = a + b;

        // SpringMVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", String.format("%d + %d = %d", a, b, result));
        // 返回视图位置
        return "add";
    }

    /**
     * Restful风格
     *      http://localhost:8080/add2/1/2
     */
    @RequestMapping("/add2/{a}/{b}")
    public String add2(@PathVariable int a, @PathVariable int b, Model model) {
        int result = a + b;

        // SpringMVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", String.format("%d + %d = %d", a, b, result));
        // 返回视图位置
        return "add";
    }
}
