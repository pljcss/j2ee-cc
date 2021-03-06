package com.servletdemo;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: cs
 * @Date: 2021/2/5 5:48 下午
 * @Desc: 实现Servlet接口，并在web.xml配置映射
 */
public class MyServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("My First Servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
