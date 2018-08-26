package com.rensy.myservlet;

import com.rensy.studentmanage.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by renshunyu on 2018/8/26.
 */
public class InsertAndQueryServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rep){
        Student student = new Student();
        student.setName(req.getParameter("name"));
        student.setAge(Integer.valueOf(req.getParameter("age")));
        student.setAddress(req.getParameter("address"));
        List<Student> list;
        if(this.getServletContext().getAttribute("students") != null){
            list = (List) this.getServletContext().getAttribute("students");
        }else{
            list= new ArrayList();
        }
        list.add(student);
        this.getServletContext().setAttribute("students",list);
        list = (List) this.getServletContext().getAttribute("students");
        req.setAttribute("list",list);
        for (Student s:list){
            System.out.println(s);
        }
        RequestDispatcher requestDispatcher =  req.getRequestDispatcher("list.jsp");
        try {
            requestDispatcher.forward(req,rep);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
