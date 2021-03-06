package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: cs
 * @Date: 2021/2/7 12:55 下午
 * @Desc:
 */
@WebFilter("/targets")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 拦截器进行处理
        System.out.println("拦截器 start-----");

        // 拦截器进行处理完成后，把请求向下传递
        filterChain.doFilter(servletRequest, servletResponse);

        // 拦截器进行处理
        System.out.println("拦截器 end-----");
    }
}
