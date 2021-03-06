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
 * @Date: 2021/2/6 11:23 下午
 * @Desc:
 */
@WebServlet(name = "GetSessionServlet", value = "/getsession")
public class GetSessionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1、通过request对象获取Session对象
        HttpSession session = request.getSession();

        String username = (String) session.getAttribute("username");

        System.out.println("从session中获取了 ：" + username);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
