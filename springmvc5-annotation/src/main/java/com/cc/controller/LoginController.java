package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author: cs
 * @Date: 2021/2/8 6:21 下午
 * @Desc:
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @PostMapping("/login")
    public String login(String username, String password, HttpSession session) {
        // 把用户信息存储在session中
        session.setAttribute("userLoginInfo", username);
        System.out.println("username ====== " + username);
        System.out.println(session.getAttribute("userLoginInfo"));


        // 登录成功跳转到主页 main.jsp
        return "main";
    }


    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/goLogin")
    public String goLogin() {
        return "login";
    }
}
