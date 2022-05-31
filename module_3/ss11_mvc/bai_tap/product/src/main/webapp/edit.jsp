<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/5/2022
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to customer list</a>
</p>
<form method="post">
    <label>tên sản phẩm</label>
    <input type="text" name="name"><br>
    <label>giá</label>
    <input type="text" name="gia"><br>
    <label>số lượng</label>
    <input type="text" name="soLuong"><br>
    <button type="submit">Update</button>
</form>

</body>
</html>
