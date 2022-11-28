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
        <a class="navbar-brand" href="/customer">
            <img src="https://zoukclub.com/wp-content/uploads/2019/11/Furama-Riverfront-Logo.png"
                 width="400px" height="150px"></a>
        <form class="form-inline">
            <a class="navbar-brand">Nguyen Nhu Hoa</a>
        </form>
    </nav>
</header>
<h2>Edit customer</h2>
<div class=" justify-content-center">
    <table border="0" class="table table-bordered table-danger  w-75">
        <form method="post">
            <tr>
                <td><label>Name</label></td>
                <td><input type="text" name="name" value="${customer.name}">
                    <small style="color: red">${errorMap.name}</small>
                </td>
            </tr>

            <tr>
                <td><label>Birthday</label></td>
                <td><input type="date" name="birthday" value="${customer.birthday}">
                    <small style="color: red">${errorMap.birthday}</small>

                </td>
            </tr>

            <tr>
                <td><label>Gender</label></td>
                <td>
                    <select name="gender">
                        <small style="color: red">${errorMap.gender}</small>
                        <option>Chọn giới tính</option>
                        <option value="1">Nam</option>
                        <option value="0">Nữ</option>
                        <option value="2">giới tính thứ 3</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td><label>id card</label></td>
                <td>
                    <input type="text" name="idCard" value="${customer.idCard}">
                    <small style="color: red">${errorMap.idCard}</small>
                </td>
            </tr>
            <tr>
                <td><label>phone</label></td>
                <td>
                    <input type="text" name="phone" value="${customer.phone}">
                    <small style="color: red">${errorMap.phone}</small>
                </td>
            </tr>

            <tr>
                <td><label>email</label></td>
                <td>
                    <input type="text" name="email" value="${customer.email}">
                    <small style="color: red">${errorMap.email}</small>
                </td>
            </tr>

            <tr>
                <td><label>address</label></td>
                <td><input type="text" name="address" value="${customerUpdate.address}">
                    <small style="color: red">${errorMap.address}</small>
                </td>
            </tr>


            <td>
                <select name="idCustomerType">
                    <c:forEach items="${customerTypeList}" var="temp">
                        <option value="${temp.idCustomerType}">${temp.nameCustomerType}</option>
                    </c:forEach>
                </select>
            </td>

            <tr>
                <td>
                    <button type="submit" content="btn btn-primary">Submit</button>
                </td>
            </tr>

        </form>
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
