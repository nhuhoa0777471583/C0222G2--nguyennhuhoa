<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
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
    <form class="form-inline" action="/customer">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit" name="action" value="search">Search</button>
    </form>
</nav>


<h1>List customer</h1>

<h4><a href="/customer?action=create">Create</a></h4>
<p>${message}</p>
<caption>List of customer</caption>

<table class="table table-bordered table-striped" style="width: 100%" id="tableCustomer">

    <thead class="thead-dark">
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
    </thead>

    <tbody>
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
    </tbody>
</table>


</body>
<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>


<script>
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
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
