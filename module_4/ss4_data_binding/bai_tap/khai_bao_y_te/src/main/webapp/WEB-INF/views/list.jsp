
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>
            <label>Họ và tên(ghi chữ in hoa):</label>
        </td>
        <td>${declaration.name}</td>
    </tr>

    <tr>
        <td>
            <label>Năm sinh:</label>
        </td>
        <td>${declaration.birthYear}</td>
    </tr>

    <tr>
        <td>
            <label>Giới tính:</label>
        </td>
        <td>${declaration.gender}</td>
    </tr>
    <tr>
        <td>
            <label>Quốc tịch:</label>
        </td>
        <td>${declaration.nationality}</td>
    </tr>

    <tr>
        <td>CMND/CCCD/số hộ chiếu</td>
        <td>${declaration.idCard}</td>
    </tr>

    <tr>
        <td>Thông tin đi lại:</td>
        <td>${declaration.travelInfor}</td>
    </tr>

    <tr>
        <td>Số hiệu phương tiện:</td>
        <td>Số ghế:</td>
    </tr>
    <tr>
        <td>${declaration.idVehicle}</td>
        <td>${declaration.seats}</td>
    </tr>
    <tr>
        <td>Ngày khởi hành:</td>
        <td>Ngày kết thúc:</td>
    </tr>
    <tr>
        <td>${declaration.startDay}</td>
        <td>${declaration.endDay}</td>
    </tr>

    <tr>
        <td>Trong vòng 14 ngày qua, Anh/chị có đến thành phố nào?</td>
    </tr>
    <tr>
        <td>${declaration.infoGoToIn14Day}</td>
    </tr>
</table>
</body>
</html>
