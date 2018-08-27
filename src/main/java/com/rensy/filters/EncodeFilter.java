package com.rensy.filters;

import javax.servlet.*;
import java.io.IOException;

public class EncodeFilter implements Filter{
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter创建了！");

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("拦截了！");
        servletRequest.setCharacterEncoding("gbk");
        filterChain.doFilter(servletRequest,servletResponse);

    }

    public void destroy() {
        System.out.println("filter销毁了！");

    }
}
