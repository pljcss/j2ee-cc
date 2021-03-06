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
 * @Desc:
 */
@WebServlet(value = "/bb")
public class BbServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("bb 执行了....");
        String aa = (String) req.getAttribute("fromAA");

        System.out.println(String.format("fromAA的值：%s", aa));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
