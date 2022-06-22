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

<h2>Create mặt bằng</h2>
<table border="0" class="table table-bordered table-danger  w-75 mx-auto">
    <form method="post">
        <tr>
            <td><label>mã mặt bằng</label></td>
            <td><input type="text" name="maMatBang"></td>
        </tr>
        <tr>
            <td><label>diện tích</label></td>
            <td><input type="text" name="dienTich"></td>
        </tr>
        <tr>
            <td><label>Trạng thái</label></td>
            <td>
                <select name="trangThai">
                    <c:forEach items="${trangThaiList}" var="i">
                        <option value="${i.maTrangThai}">${i.tenTrangThai}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>


        <tr>
            <td><label>tầng</label></td>
            <td>
                <select name="maTang">
                    <c:forEach items="${tangList}" var="item">
                        <option value="${item.maTang}">${item.soTang}</option>
                    </c:forEach>
                </select>
        </tr>
        <tr>
            <td><label>loại văn phòng</label></td>
            <td>
                <select name="loaiVanPhong">
                    <c:forEach items="${loaiVanPhongList}" var="temp">
                        <option value="${temp.maLoaiVanPhong}">${temp.tenLoaiVanPhong}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>

        <tr>
            <td><label>mô tả</label></td>
            <td><input type="text" name="moTa"></td>
        </tr>

        <tr>
            <td><label>giá cho thuê(VNĐ)</label></td>
            <td><input type="text" name="gia"></td>
        </tr>
        <tr>
            <td><label>ngày bắt đầu</label></td>
            <td><input type="date" name="ngayBatDau"></td>
        </tr>

        <tr>
            <td><label>ngày kết thúc</label></td>
            <td><input type="date" name="ngayKetThuc"></td>
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
