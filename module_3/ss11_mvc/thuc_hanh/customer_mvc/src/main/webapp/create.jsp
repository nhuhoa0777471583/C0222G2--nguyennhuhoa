<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/5/2022
  Time: 10:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Create new customer</h2>
<p>
    <c:if test="${message} != null">
        <span class="message">${message}</span>
    </c:if>
</p>
<p>
    <a href="/customer">Back to customer list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Customer information</legend>
        <table border="1">
            <tr>
                <td>tên:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>emai:</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>địa chỉ:</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="create customer"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
