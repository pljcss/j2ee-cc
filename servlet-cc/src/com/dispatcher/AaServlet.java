package com.dispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: cs
 * @Date: 2021/2/6 9:30 下午
 * @Desc: 浏览器通过访问/aa，跳转到/bb
 *        实现servlet跳转，携带数据跳转
 */
@WebServlet(value = "/aa")
public class AaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 通过request作用域做数据存储
        req.setAttribute("fromAA", "hello dispatcher!");
        req.getRequestDispatcher("/bb").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
