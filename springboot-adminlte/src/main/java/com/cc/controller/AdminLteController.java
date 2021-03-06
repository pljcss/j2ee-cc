package com.cc.controller;

import com.cc.bean.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author: cs
 * @Date: 2021/2/20 6:01 下午
 * @Desc:
 */
@Controller
public class AdminLteController {


    @GetMapping({"/", "/login"})
    public String loginPage(Model model) {
        return "login";
    }

    /**
     * 表单登录，使用重定向解决表单重复提交问题
     */
    @PostMapping("/login")
    public String startPage(LoginUser user, HttpSession httpSession, Model model) {
        System.out.println(user);
        if ("admin".equals(user.getUserName()) && "123".equals(user.getPassword())) {
            // 登录成功的用户保存到session中
            httpSession.setAttribute("loginUser", user);
            // 登录成功重定向到starter.html, 重定向防止表单重复提交
            return "redirect:starter.html";
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "login";
        }

    }

    @GetMapping("/starter.html")
    public String loginSuccess(HttpSession session, Model model) {
        // 是否登录，拦截器、过滤器
//        Object user = session.getAttribute("loginUser");
//        if (user != null) {
//            return "starter";
//        }
//
//        model.addAttribute("msg", "请登录");
        return "login";
    }
}
