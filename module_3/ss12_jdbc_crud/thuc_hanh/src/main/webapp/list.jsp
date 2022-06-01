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
  <form class="form-inline" method="post" action="/user?action=search">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="search" >
    <input class="btn btn-outline-success my-2 my-sm-0" type="submit" value="Search">
  </form>
</nav>
<h2>
  <a href="/user?action=create">Add New User</a>
</h2>
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
