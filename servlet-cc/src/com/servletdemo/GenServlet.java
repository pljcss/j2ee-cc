package com.servletdemo;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @Author: cs
 * @Date: 2021/2/6 12:16 下午
 * @Desc: 实现GenericServlet接口，并在web.xml配置映射
 */
public class GenServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello GenericServlet");
    }
}
