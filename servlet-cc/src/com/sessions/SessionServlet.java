package com.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: cs
 * @Date: 2021/2/6 11:14 下午
 * @Desc:
 */
@WebServlet(name = "SessionServlet", value = "/ss")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1、通过request对象获取Session对象
        HttpSession session = request.getSession();
        System.out.println("Session :: " + session.getId());

        // 2、使用Session保存数据
        session.setAttribute("username", "leo");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
