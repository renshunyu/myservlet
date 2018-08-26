<%@ page import="java.util.Date" %>
<%@ page errorPage="error.jsp" %><%--
  Created by IntelliJ IDEA.
  User: renshunyu
  Date: 2018/8/26
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% System.out.println(new Date());%><br>
<form action="/test/first" method="post">
    <input name="user"><br>
    <input type="password" name="password"><br>
    <input type="submit" value="登录">
</form>

</body>
</html>
