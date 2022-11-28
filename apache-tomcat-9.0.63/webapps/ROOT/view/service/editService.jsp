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
        <a class="navbar-brand" href="/service">
            <img src="https://zoukclub.com/wp-content/uploads/2019/11/Furama-Riverfront-Logo.png"
                 width="400px" height="150px"></a>
        <form class="form-inline">
            <a class="navbar-brand">Nguyen Nhu Hoa</a>
        </form>
    </nav>
</header>
<nav class="navbar navbar-light bg-light">
    <form class="form-inline">
        <h2>Edit service</h2>
        <h3><a href="/service">Back</a></h3>
    </form>
</nav>

<table border="0" class="table table-bordered w-75 mx-auto">
    <form method="post">
            <tr>
                <td>nameService</td>
                <td><input name="name" type="text" value="${service.nameService}"></td>
            </tr>
            <tr>
                <td>diện tích sử dụng</td>
                <td><input name="area" type="text" value="${service.area}"></td>
            </tr>
            <tr>
                <td>Chi phí thuê</td>
                <td><input name="cost" type="text" value="${service.cost}"></td>
            </tr>
            <tr>
                <td>maxPeople</td>
                <td><input name="maxPeople" type="text" value="${service.maxPeople}"></td>
            </tr>
            <tr>
                <td>standard_room</td>
                <td><input name="standardRoom" type="text" value="${service.standardRoom}"></td>
            </tr>
            <tr>
                <td>description_other_convenience</td>
                <td><input name="descriptionOtherConvenience" type="text" value="${service.descriptionOtherConvenience}">
                </td>
            </tr>
            <tr>
                <td>pool_area</td>
                <td><input name="poolArea" type="text" value="${service.poolArea}"></td>
            </tr>
            <tr>
                <td>number_of_float</td>
                <td><input name="numberofFloat" type="text" value="${service.numberOfFloat}"></td>
            </tr>

        <tr>
            <td>id_rent_type</td>
            <td>
                <select name="idRentType">
                    <c:forEach items="${rentTypeList}" var="temp">
                        <c:if test="${temp.idRentType == service.idRentType}">
                            <option value="${temp.idRentType}" selected>${temp.nameRentType}</option>
                        </c:if>
                        <c:if test="${temp.idRentType != service.idRentType}">
                            <option value="${temp.idRentType}" >${temp.nameRentType}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </td>
        </tr>

        <tr>
            <td>id_service_type</td>
            <td>
                <select name="idServiceType">
                    <c:forEach items="${serviceTypeList}" var="i">
                        <c:if test="${i.idServiceType == service.idServiceType}">
                            <option value="${i.idServiceType }" selected>${i.nameServiceType}</option>
                        </c:if>
                        <c:if test="${i.idServiceType != service.idServiceType}">
                            <option value="${i.idServiceType }" >${i.nameServiceType}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">Submit</button>
            </td>
        </tr>
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
