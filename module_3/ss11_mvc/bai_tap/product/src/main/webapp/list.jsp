<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<body>
<a href="/product?action=create">Create product</a>
<p>${message}</p>
<table class="table">
    <thead>
    <tr>
        <th scope="col">id</th>
        <th scope="col">tên sản phẩm</th>
        <th scope="col">giá bán</th>
        <th scope="col">mô tả</th>
        <th scope="col">nhà sản xuất</th>
        <th scope="col">edit</th>
        <th scope="col">delete</th>
    </tr>
    <c:forEach items="${productList}" var="temp">
        <tr>
            <td>${temp.id}</td>
            <td><a href="/product?action=detail&id=${temp.id}">${temp.name}</a></td>
            <td>${temp.giaBan}</td>
            <td>${temp.moTa}</td>
            <td>${temp.nhaSanXuat}</td>
            <td><a href="/product?action=edit&id=${temp.id}">edit</a></td>
            <td><a href="/product?action=delete&id=${temp.id}">delete</a></td>
        </tr>
    </c:forEach>
    </thead>
</table>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

</html>
