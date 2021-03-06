package com.rensy.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("登录拦截器初始化！");

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        System.out.println(httpServletRequest.getSession().getAttribute("user") != null);
        System.out.println(httpServletRequest.getRequestURI() == "/test/login.jsp");
        System.out.println(httpServletRequest.getRequestURI() == "/test/login");
        System.out.println(httpServletRequest.getSession().getAttribute("user") != null || httpServletRequest.getRequestURI().equals("/test/login.jsp") || httpServletRequest.getRequestURI().equals("/test/login"));
        if (httpServletRequest.getSession().getAttribute("user") != null || httpServletRequest.getRequestURI().equals("/test/login.jsp") || httpServletRequest.getRequestURI().equals("/test/login")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            System.out.println("假");
            httpServletResponse.sendRedirect("/test/login.jsp");
        }

    }

    public void destroy() {
        System.out.println("登录拦截器销毁！");

    }
}
