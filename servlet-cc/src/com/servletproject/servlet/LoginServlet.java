package com.servletproject.servlet;

import com.servletproject.entity.Admin;
import com.servletproject.service.AdminService;
import com.servletproject.service.impl.AdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: cs
 * @Date: 2021/2/6 8:25 下午
 * @Desc:
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        // 收参
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(String.format("用户名：%s;密码：%s", username, password));
        // 调用业务逻辑
        AdminService adminService = new AdminServiceImpl();
        Admin admin = adminService.login(username, password);

        // 处理结果
        PrintWriter writer = resp.getWriter();
        if (admin != null) {
            // 响应给客户端一个页面，显示登录成功
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<meta charset='utf-8'>");
            writer.println("<title>结果页面</title>");
            writer.println("</head>");

            writer.println("<body>");
            writer.println("<h1>登录成功！</h1>");
            writer.println("</body>");
            writer.println("</html>");

        } else {
            // 响应给客户端一个页面，显示登录失败
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<meta charset='utf-8'>");
            writer.println("<title>结果页面</title>");
            writer.println("</head>");

            writer.println("<body>");
            writer.println("<h1>登录失败！</h1>");
            writer.println("</body>");
            writer.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
