<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <a class="navbar-brand" href="/furama">
            <img href="/furama" src="https://zoukclub.com/wp-content/uploads/2019/11/Furama-Riverfront-Logo.png"
                 width="400px" height="150px"></a>
        <form class="form-inline">
            <a class="navbar-brand">Nguyen Nhu Hoa</a>
        </form>
    </nav>
</header>


<nav class="navbar navbar-light bg-light">
    <form class="form-inline" action="/service">
        <input class="form-control mr-sm-2" type="search" placeholder="nhập tên cần tìm" value="${nameSearch}"  aria-label="Search" name="nameSearchEmployee" >
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit" name="action" value="search">Search</button>
    </form>
</nav>

<h2>List of Service</h2>
<h3><a href="/service?action=create">Create</a></h3>


<table class="table table-bordered table-striped" style="width: 100%" id="tableService">
    <thead>
    <tr class="bg-primary">
        <th scope="col">id</th>
        <th scope="col">name</th>
        <th scope="col">area</th>
        <th scope="col">cost</th>
        <th scope="col">max people</th>
        <th scope="col">standard room</th>
        <th scope="col">description other convenience</th>
        <th scope="col">pool area</th>
        <th scope="col">number of float</th>
        <th scope="col">id rent type</th>
        <th scope="col">id service type</th>
        <th scope="col">edit</th>
        <th scope="col">delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="temp" items="${serviceList}">
        <tr>
            <th>${temp.idService}</th>
            <th>${temp.nameService}</th>
            <th>${temp.area}</th>
            <th>
                <fmt:formatNumber pattern="#" value="${temp.cost}"/>
            </th>
            <th>${temp.maxPeople}</th>
            <th>${temp.standardRoom}</th>
            <th>${temp.descriptionOtherConvenience}</th>
            <th>${temp.poolArea}</th>
            <th>${temp.numberOfFloat}</th>
            <th>${temp.idRentType}</th>
            <th>${temp.idServiceType}</th>
            <th><a href="/service?action=edit&id=${temp.idService}">Edit</a></th>
            <th>
                <button type="button" class="btn btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal${temp.idService}">
                    Delete
                </button>

                <!-- Modal -->
                <div class="modal fade" id="exampleModal${temp.idService}" tabindex="-1" aria-labelledby="exampleModalLabel"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close">X</button>
                            </div>
                            <div class="modal-body">
                                <p> Do you want delete service have id is
                                <p class="text-danger"> ${temp.idService}</p> and name is <p
                                    class="text-danger"> ${temp.nameService}</p></p>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                <button type="button" class="btn btn-primary">
                                    <a href="/service?action=delete&id=${temp.idService}">Delete</a>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </th>
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
        $('#tableService').dataTable({
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
