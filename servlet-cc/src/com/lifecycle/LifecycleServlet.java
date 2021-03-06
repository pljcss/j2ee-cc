package com.lifecycle;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @Author: cs
 * @Date: 2021/2/6 10:07 下午
 * @Desc:
 */
@WebServlet(value = "/lifecycle")
public class LifecycleServlet implements Servlet {

    /**
     * 执行一次
     */
    public LifecycleServlet() {
        System.out.println("1、实例化");
    }

    /**
     * 执行一次
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2、初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 执行多次
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3、提供服务：接收请求，响应结果");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 执行一次
     */
    @Override
    public void destroy() {
        System.out.println("4、销毁");
    }
}
