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
import java.util.List;

/**
 * @Author: cs
 * @Date: 2021/2/6 9:01 下午
 * @Desc:
 */
@WebServlet("/showall")
public class ShowAllAdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        AdminService adminService = new AdminServiceImpl();
        List<Admin> adminList = adminService.showAllAdmin();

        PrintWriter writer = resp.getWriter();
        writer.println(adminList);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
