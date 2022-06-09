<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

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
<table border="0" class="table table-bordered table-danger">
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
