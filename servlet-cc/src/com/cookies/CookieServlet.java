package com.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: cs
 * @Date: 2021/2/6 10:35 下午
 * @Desc: 设置cookie
 */
@WebServlet(value = "/cookie")
public class CookieServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 服务端创建Cookie对象
        Cookie cookie = new Cookie("cookie-key", "hello-cookie");
        Cookie cookie2 = new Cookie("cookie-password", "123456");

        // 设置cookie的响应路径
        cookie.setPath("/servlet_cc_war_exploded/geta");
        cookie2.setPath("/servlet_cc_war_exploded");
        // 设置cookie有效期
        cookie.setMaxAge(60 * 60);
        cookie2.setMaxAge(60 * 60);

        // 将Cookie响应给客户端
        resp.addCookie(cookie);
        resp.addCookie(cookie2);
    }
}
