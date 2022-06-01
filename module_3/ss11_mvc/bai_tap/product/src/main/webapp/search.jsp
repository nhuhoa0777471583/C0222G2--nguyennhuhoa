<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<body>
<p>
    <a href="/product">Back to customer list</a>
</p>
<div>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">tên sản phẩm</th>
            <th scope="col">giá</th>
            <th scope="col">nhà sản xuất</th>
        </tr>
        </thead>
        <c:forEach items="${productList}" var="pro">
            <tbody>
            <tr>
                <th><c:out value="${pro.id}"></c:out></th>
                <th><c:out value="${pro.name}"></c:out></th>
                <td><c:out value="${pro.giaBan}"></c:out></td>
                <td><c:out value="${pro.moTa}"></c:out></td>
                <td><c:out value="${pro.nhaSanXuat}"></c:out></td>
            </tr>
            </tbody>
        </c:forEach>
    </table>
</div>
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
