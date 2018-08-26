<%@ page import="java.util.List" %>
<%@ page import="com.rensy.studentmanage.model.Student" %><%--
  Created by IntelliJ IDEA.
  User: renshunyu
  Date: 2018/8/26
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%List<Student> list =(List) application.getAttribute("students");
%>

<html>
<head>
    <title>学生列表</title>
</head>
<body>
<table>
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>地址</th>
    </tr>
    <% for (Student student:list) {%>
    <tr>
        <td><%=student.getName()%></td>
        <td><%=student.getAge()%></td>
        <td><%=student.getAddress()%></td>
    </tr>
    <% }%>
    <a href="create.jsp">新增</a>
</table>

</body>
</html>
