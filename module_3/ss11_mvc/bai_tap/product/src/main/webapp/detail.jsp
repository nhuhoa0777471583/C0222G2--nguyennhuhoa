<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <label>id: </label>
    <c:out value="${productList.id}"></c:out><br>
    <label>tên sản phẩm: </label>
    <c:out value="${productList.name}"></c:out><br>
    <label>giá: </label>
    <c:out value="${productList.giaBan}"></c:out><br>
    <label>mô tả: </label>
    <c:out value="${productList.moTa}"></c:out><br>
    <label>nhà sản xuất: </label>
    <c:out value="${productList.nhaSanXuat}"></c:out><br>

</body>
</html>
