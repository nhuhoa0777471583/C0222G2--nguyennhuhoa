<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h3><a href=""></a></h3>
<div></div>
<table class="table table-bordered">
    <caption>List of customer</caption>
    <thead>
    <tr class="bg-primary">
        <th scope="col">id</th>
        <th scope="col">name</th>
        <th scope="col">birthday</th>
        <th scope="col">gender</th>
        <th scope="col">idCard</th>
        <th scope="col">phone</th>
        <th scope="col">email</th>
        <th scope="col">address</th>
        <th scope="col">idCustomerType</th>
        <th scope="col">edit</th>
        <th scope="col">delete</th>
    </tr>
<c:forEach var="temp" items="${customerList}">
    <tr>
        <th>${temp.id}</th>
        <th>${temp.name}</th>
        <th>${temp.birthday}</th>
        <th>
            <c:if test="${temp.gender == 1}">
                Nam
            </c:if>
            <c:if test="${temp.gender == 0}">
                Nữ
            </c:if>
        </th>
        <th>${temp.idCard}</th>
        <th>${temp.phone}</th>
        <th>${temp.email}</th>
        <th>${temp.address}</th>
        <th>
            <c:choose>
                <c:when test="${temp.idCustomerType == 1}">Diamond</c:when>
                <c:when test="${temp.idCustomerType == 2}">Platinium</c:when>
                <c:when test="${temp.idCustomerType == 3}">Gold</c:when>
                <c:when test="${temp.idCustomerType == 4}">Silver</c:when>
                <c:when test="${temp.idCustomerType == 5}">Member</c:when>
            </c:choose>
                </th>
        <th><a href="/customer?action=edit&id=${temp.id}">Edit</a></th>
        <th><a href="/customer?action=delete&id=${temp.id}">Delete</a></th>
    </tr>
</c:forEach>
    </thead>
</table>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</html>
