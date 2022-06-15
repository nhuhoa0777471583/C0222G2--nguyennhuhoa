<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
</head>
<body>
<header>
    <nav class="navbar navbar-light bg-light justify-content-between ">
        <a class="navbar-brand">
            <img src="https://zoukclub.com/wp-content/uploads/2019/11/Furama-Riverfront-Logo.png"
                 width="400px" height="150px"></a>
        <form class="form-inline">
            <a class="navbar-brand">Nguyen Nhu Hoa</a>
        </form>
    </nav>
</header>

<h2>Create employee</h2>
<table border="0" class="table table-bordered table-danger  w-75 mx-auto">
    <form method="post">
        <tr>
            <td><label>Name</label></td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td><label>Birthday</label></td>
            <td><input type="date" name="birthday"></td>
        </tr>


        <tr>
            <td><label>id card</label></td>
            <td><input type="text" name="idCard">


        </tr>
        <tr>
            <td><label>salary</label></td>
            <td><input type="text" name="salary"></td>
        </tr>
        <tr>
            <td><label>phone</label></td>
            <td><input type="text" name="phone"></td>
        </tr>

        <tr>
            <td><label>email</label></td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td><label>address</label></td>
            <td><input type="text" name="address"></td>
        </tr>

        <tr>
            <td>Position</td>
            <td>
                <select name="idPosition">
                    <c:forEach items="${positionList}" var="temp">
                        <option value="${temp.idPosition}">${temp.namePosition}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>

        <tr>
            <td>Education</td>
            <td>
                <select name="idEducation">
                    <c:forEach items="${educationList}" var="temp">
                        <option value="${temp.idEducation}">${temp.nameEducation}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>

        <tr>
            <td>Divition</td>
            <td>
                <select name="idDivition">
                    <c:forEach items="${divitionList}" var="temp">
                        <option value="${temp.idDivition}">${temp.nameDivition}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <td>
            <button type="submit">Submit</button>
        </td>
    </form>
</table>

</body>

<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../../bootstrap413/js/bootstrap.bundle.js"></script>

</html>
