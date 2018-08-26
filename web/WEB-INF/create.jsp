<%--
  Created by IntelliJ IDEA.
  User: renshunyu
  Date: 2018/8/26
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@page errorPage="error.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增</title>
</head>
<body>
<form action="/test/insert" method="post">
    name:<input name="name"><br>
    age:<input name="age"><br>
    address:<input name="address"><br>
    <input type="submit" value="新增">
</form>

</body>
</html>
