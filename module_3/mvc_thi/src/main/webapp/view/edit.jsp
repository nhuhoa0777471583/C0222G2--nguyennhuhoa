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
    <table border="0" class="table table-bordered table-danger  w-75 mx-auto">
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

<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../../bootstrap413/js/bootstrap.bundle.js"></script>

</html>
