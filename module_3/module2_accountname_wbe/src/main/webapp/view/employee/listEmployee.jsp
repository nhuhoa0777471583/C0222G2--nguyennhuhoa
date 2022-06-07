<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/6/2022
  Time: 5:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">

</head>
<body>
<header>
    <nav class="navbar navbar-light bg-light justify-content-between ">
        <a class="navbar-brand">
            <img href="/furama" src="https://zoukclub.com/wp-content/uploads/2019/11/Furama-Riverfront-Logo.png"
                 width="400px" height="150px"></a>
        <form class="form-inline">
            <a class="navbar-brand">Nguyen Nhu Hoa</a>
        </form>
    </nav>
</header>



<nav class="navbar navbar-light bg-light">
    <form class="form-inline" action="/employee">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit" name="action" value="search">Search</button>
    </form>
</nav>

<h2>List of Employee</h2>
<h3><a href="/employee?action=create">Create</a></h3>
<p>${message}</p>

<table class="table table-bordered table-striped" style="width: 100%" id="tableEmployee">
    <thead>
    <tr class="bg-primary">
        <th scope="col">id</th>
        <th scope="col">name</th>
        <th scope="col">birthday</th>
        <th scope="col">idCard</th>
        <th scope="col">salary</th>
        <th scope="col">phone</th>
        <th scope="col">email</th>
        <th scope="col">address</th>
        <th scope="col">idPosition</th>
        <th scope="col">idEducationDegree</th>
        <th scope="col">idDivision</th>
        <%--        <th scope="col">userName</th>--%>
        <th scope="col">edit</th>
        <th scope="col">delete</th>
    </tr>
    </thead>
<tbody>
    <c:forEach var="temp" items="${employeeList}">
        <tr>
            <th>${temp.id}</th>
            <th>${temp.name}</th>
            <th>${temp.birthday}</th>
            <th>${temp.idCard}</th>
            <th>${temp.salary}</th>
            <th>${temp.phone}</th>
            <th>${temp.email}</th>
            <th>${temp.address}</th>
            <th>
                <c:choose>
                    <c:when test="${temp.idPosition == 1}">Lễ tân</c:when>
                    <c:when test="${temp.idPosition == 2}">phục vụ</c:when>
                    <c:when test="${temp.idPosition == 3}">chuyên viên</c:when>
                    <c:when test="${temp.idPosition == 4}">giám sát</c:when>
                    <c:when test="${temp.idPosition == 5}">quản lý</c:when>
                    <c:when test="${temp.idPosition == 6}">giám đốc</c:when>
                </c:choose>
            </th>
            <th>
                <c:choose>
                    <c:when test="${temp.idEducationDegree == 1}">Trung cấp</c:when>
                    <c:when test="${temp.idEducationDegree == 2}">Cao đẳng</c:when>
                    <c:when test="${temp.idEducationDegree == 3}">Đại học</c:when>
                    <c:when test="${temp.idEducationDegree == 4}">sau đại học</c:when>
                </c:choose>
            </th>
            <th>
                <c:choose>
                    <c:when test="${temp.idDivision == 1}">Sale – Marketing</c:when>
                    <c:when test="${temp.idDivision == 2}">Hành Chính</c:when>
                    <c:when test="${temp.idDivision == 3}">Phục vụ</c:when>
                    <c:when test="${temp.idDivision == 4}">Quản lý</c:when>
                </c:choose>
            </th>
                <%--            <th>${temp.userName}</th>--%>
            <th><a href="/employee?action=edit&id=${temp.id}">Edit</a></th>
            <th><a href="/employee?action=delete&id=${temp.id}">Delete</a></th>
        </tr>
    </c:forEach>
</tbody>
</table>
</body>
<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>


<script>
    $(document).ready(function () {
        $('#tableEmployee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        })
    })
</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</html>
