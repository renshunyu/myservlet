<%@ page import="com.rensy.studentmanage.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: renshunyu
  Date: 2018/8/26
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Student student = new Student();
    student.setName(request.getParameter("name"));
    student.setAge(Integer.valueOf(request.getParameter("age")));
    student.setAddress(request.getParameter("address"));
    List list;
    if (application.getAttribute("students") != null){
    list = (List) application.getAttribute("students");
    }else{
        list= new ArrayList();
    }
    list.add(student);
    application.setAttribute("students", list);
    response.sendRedirect("list.jsp");
%>

