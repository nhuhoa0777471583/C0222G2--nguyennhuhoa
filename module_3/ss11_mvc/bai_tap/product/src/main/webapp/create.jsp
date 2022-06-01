<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/product" method="post">
    <input type="hidden" name="action" value="create">
    <label>id</label>
    <input type="text" name="id"><br>
    <label>tên sản phẩm</label>
    <input type="text" name="name"><br>
    <label>giá</label>
    <input type="text" name="gia"><br>
    <label>mô tả</label>
    <input type="text" name="moTa"><br>
    <label>nhà sản xuất</label>
    <input type="text" name="nhaSanXuat"><br>
    <button type="submit">Create</button>
</form>
</body>
</html>
