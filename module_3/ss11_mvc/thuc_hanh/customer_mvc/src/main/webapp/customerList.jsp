<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/5/2022
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Danh sách khách hàng</h2>
<p>
    <a href="/customer?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <th>tên</th>
        <th>email</th>
        <th>địa chỉ</th>
        <th>edit</th>
        <th>delete</th>
    </tr>
    <c:forEach items="${customer}" var="temp">
    <tr>
        <td><a href="/customer?action=service&id=${temp.id}">${temp.name}</a></td>
        <td>${temp.email}</td>
        <td>${temp.address}</td>
        <td><a href="/customer?action=edit&id=${temp.id}">edit</a></td>
        <td><a href="/customer?action=delete&id=${temp.id}">delete</a></td>
    </tr>


    </c:forEach>



</table>

</body>
</html>
