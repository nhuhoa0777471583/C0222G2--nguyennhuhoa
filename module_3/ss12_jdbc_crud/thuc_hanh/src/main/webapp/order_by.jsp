<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<p>
    <a href="/user">quay lại</a>
</p>
<form method="get">
<div>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">name</th>
            <th scope="col">email</th>
            <th scope="col">country</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="temp">
            <tr>
                <th>${temp.getId()}</th>
                <th>${temp.getName()}</th>
                <td>${temp.getEmail()}</td>
                <td>${temp.getCountry()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</form>
</body>
</html>
