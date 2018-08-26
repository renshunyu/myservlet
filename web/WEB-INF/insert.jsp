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
<jsp:useBean id="student" class="com.rensy.studentmanage.model.Student"></jsp:useBean>
<jsp:setProperty name="student" property="*"></jsp:setProperty>
<%
    List list;
    if (application.getAttribute("students") != null){
    list = (List) application.getAttribute("students");
    }else{
        list= new ArrayList();
    }
    list.add(student);
    application.setAttribute("students", list);
%>
<jsp:forward page="list.jsp"></jsp:forward>