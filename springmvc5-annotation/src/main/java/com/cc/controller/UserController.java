package com.cc.controller;

import com.cc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: cs
 * @Date: 2021/2/8 2:41 下午
 * @Desc: 接收请求参数与数据回显
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 提交数据url与接收方法的参数名一致，可以直接接收
     * localhost:8080/user/t1?name=lily
     */
    @GetMapping("/t1")
    public String test1(String name, Model model) {
        // 1、接收前端的参数
        System.out.println("接收到的前端参数为 ::: " + name);

        // 2、将返回的结果传递给前端（使用Model，SpringMVC会自动创建Model对象）
        model.addAttribute("msg", name);

        // 3、跳转视图
        return "test";
    }

    /**
     * 提交数据url与接收方法的参数名不一致，需要使用 @RequestParam 注解处理
     * localhost:8080/user/t2?username=lily
     */
    @GetMapping("/t2")
    public String test2(@RequestParam("username") String name, Model model) {
        // 1、接收前端的参数
        System.out.println("接收到的前端参数为 ::: " + name);

        // 2、将返回的结果传递给前端（使用Model，SpringMVC会自动创建Model对象）
        model.addAttribute("msg", name);

        // 3、跳转视图
        return "test";
    }


    /**
     * 前端接收的是对象
     * localhost:8080/user/t3?id=1&name=lily&age=18
     */
    @GetMapping("/t3")
    public String test3(User user) {
        System.out.println(user);

        return "test";
    }
}
