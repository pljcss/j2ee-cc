package com.register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: cs
 * @Date: 2021/2/6 5:08 下午
 * @Desc:
 */
@WebServlet(value = {"/register"})
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------------get----------------");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        System.out.println("------------get----------------");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 对request请求对象设置统一编码
        req.setCharacterEncoding("utf-8");

        System.out.println("------------post----------------");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        System.out.println("------------post----------------");

        // 相应数据给客户端
//        resp.setCharacterEncoding("utf-8");
//        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("登录成功!");
    }
}
