package com.rensy.myservlet;

import javax.servlet.ServletContext;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by renshunyu on 2018/8/26.
 */
public class FristServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep) {
        System.out.println("这个是一个get请求！");
        req.getAttributeNames();
        try {
            PrintWriter out = rep.getWriter();
            out.println("this is a get request!");
            out.println("通过过滤器设置汉字编码！界面的不在显示汉字乱码！");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rep) {
        System.out.println("这个是一个post请求！");
        Enumeration en = req.getParameterNames();
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("user",req.getParameter("user"));
        Cookie cookie = new Cookie("MSESSION",httpSession.getId());
        cookie.setMaxAge(1000);
        rep.addCookie(cookie);

        try {
            PrintWriter out = rep.getWriter();
            out.println("this is a post request!");
            out.println(httpSession.getAttribute("user"));

            while (en.hasMoreElements()) {
                String s=(String) en.nextElement();
                out.println(s);
                ServletContext sc =this.getServletContext();
                sc.setAttribute(s,req.getAttribute(s));
            }

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
