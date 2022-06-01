<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>
<p>
    <a href="/product">Back to customer list</a>
</p>
<form method="post">
    <input type="hidden" name="action" value="edit">
    <label>tên sản phẩm</label>
    <input type="text" name="name" value="${productList.name}"><br>
    <label>giá</label>
    <input type="text" name="gia" value="${productList.giaBan}"><br>
    <label>mô tả</label>
    <input type="text" name="moTa"  value="${productList.moTa}"><br>
    <label>nhà sản xuất</label>
    <input type="text" name="nhaSanXuat"  value="${productList.nhaSanXuat}"><br>
    <button type="submit">Edit</button>
</form>

</body>
</html>
