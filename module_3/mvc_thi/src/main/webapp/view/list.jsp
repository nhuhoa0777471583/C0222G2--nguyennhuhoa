<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
</head>
<body>

<nav class="navbar navbar-light bg-light">
    <form class="form-inline" action="/matBang">
        <input class="form-control mr-sm-2" type="search" placeholder="nhập tên cần tìm" value="${nameSearch}"
               aria-label="Search" name="nameSearchEmployee">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit" name="action" value="search">Search</button>
    </form>
</nav>

<h2>List of product</h2>
<h3><a href="/matBang?action=create">Create</a></h3>


<table class="table table-bordered table-striped" style="width: 100%" id="table">
    <thead>
    <tr class="bg-primary">
        <th scope="col">mã mặt bằng</th>
        <th scope="col">diện tích</th>
        <th scope="col">mã trạng thái</th>
        <th scope="col">tầng</th>
        <th scope="col">mã loại văn phòng</th>
        <th scope="col">mô tả</th>
        <th scope="col">giá cho thuê (VNĐ)</th>
        <th scope="col">ngày bắt đầu</th>
        <th scope="col">ngày kết thúc</th>
        <th scope="col">delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="temp" items="${matBangList}">
        <tr>
            <th>${temp.maMatBang}</th>
            <th>${temp.dienTich}</th>
            <th>
                <c:forEach items="${trangThaiList}" var="i">
                    <c:if test="${i.maTrangThai == temp.maTrangThai}">
                        ${i.tenTrangThai}
                    </c:if>
                </c:forEach>
            </th>
            <th>
                <c:forEach items="${tangList}" var="i">
                    <c:if test="${i.maTang==temp.maTang}">
                        ${i.soTang}
                    </c:if>
                </c:forEach>
            </th>

            <th>
                <c:forEach items="${loaiVanPhongList}" var="items">
                    <c:if test="${items.maLoaiVanPhong == temp.maLoaiVanPhong}">
                        ${items.tenLoaiVanPhong}
                    </c:if>
                </c:forEach>
            </th>

            <th>${temp.moTaChiTiet}</th>
            <th>
                <fmt:formatNumber pattern="#" value="${temp.gia}"/></th>
            <th>${temp.ngayBatDau}</th>
            <th>${temp.ngayKetThuc}</th>
            <td>
                <div class="container">

                    <button type="button" class="btn btn-danger text-white" data-toggle="modal"
                            data-target="#myModal${temp.maMatBang}">
                        Delete
                    </button>

                    <!-- The Modal -->
                    <div class="modal" id="myModal${temp.maMatBang}">
                        <div class="modal-dialog">
                            <div class="modal-content">

                                <!-- Modal Header -->
                                <div class="modal-header">
                                    <h4 class="modal-title text-warning">Warning!</h4>
                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                </div>

                                <!-- Modal body -->
                                <div class="modal-body">
                                    Ban muon xoa mat bang co id la <strong
                                        class="text-warning">${temp.maMatBang}</strong> khong?
                                </div>

                                <!-- Modal footer -->
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-primary">
                                        <a class="text-white" href="/matBang?action=delete&idDelete=${temp.maMatBang}">Yes</a>
                                    </button>
                                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                                </div>

                            </div>
                        </div>
                    </div>

                </div>
            </td>
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
        $('#table').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        })
    })
</script>

<script src="../../bootstrap413/js/bootstrap.bundle.js"></script>
</html>
