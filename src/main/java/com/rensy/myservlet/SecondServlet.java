package com.rensy.myservlet;

import javax.servlet.ServletContext;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by renshunyu on 2018/8/26.
 */
public class SecondServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep){

        try {
            PrintWriter out=rep.getWriter();
            ServletContext servletContext = this.getServletContext();
            Enumeration e= servletContext.getAttributeNames();
            HttpSession httpSession = req.getSession();
            out.println(httpSession.getAttribute("user"));
            while (e.hasMoreElements()){
                String s=(String) e.nextElement();
                out.println(s+":"+servletContext.getAttribute(s));
            }
            Cookie[] cookie = req.getCookies();
            for (Cookie c:cookie){
                out.println(c.getName()+":"+c.getValue());
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rep){
        System.out.println("this is the second post request!");

    }


}
