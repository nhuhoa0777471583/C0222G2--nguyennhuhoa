<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>

<body>

<nav class="navbar navbar-light bg-light">
    <form class="form-inline" method="get" action="/user">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search" name="searchCountry">
            <input class="btn btn-outline-success my-2 my-sm-0" type="submit" name="action" value="search">
    </form>
</nav>

<h2>
    <a href="/user?action=create">Thêm người dùng</a>
</h2>

<div align="right">
    <form method="get">
        <h3>
            <a href="/user?action=orderByName">Sắp xếp theo tên</a>
        </h3>
    </form>
</div>

<div align="center">
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${list}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
                <td>
                    <a href="/user?action=edit&id=${user.id}">Edit</a>
                    <a href="/user?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
