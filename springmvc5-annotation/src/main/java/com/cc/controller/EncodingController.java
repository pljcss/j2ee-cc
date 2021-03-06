package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: cs
 * @Date: 2021/2/8 4:17 下午
 * @Desc:
 */
@Controller
public class EncodingController {

    @PostMapping("/en/t1")
    public String test1(String username, Model model) {
        System.out.println(username);

        model.addAttribute("msg", username);
        return "test";
    }
}
