package com.cc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: cs
 * @Date: 2021/2/8 6:38 下午
 * @Desc:
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        System.out.println(session.getAttribute("userLoginInfo"));

        // 放行：判断什么情况下登录
        if (request.getRequestURI().contains("goLogin")) {
            return true;
        }
        if (request.getRequestURI().contains("login")) {
            return true;
        }
        if (session.getAttribute("userLoginInfo") != null) {
            return true;
        }

        // 判断什么情况下没登录
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);

        return false;
    }
}
