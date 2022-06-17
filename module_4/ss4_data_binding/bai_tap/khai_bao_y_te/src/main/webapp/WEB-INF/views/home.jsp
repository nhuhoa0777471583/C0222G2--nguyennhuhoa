<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Tờ khai y tế</h2>

<form:form modelAttribute="declaration" action="/home/list" method="post">
    <table border="1">
        <tr>
            <td>
                <label>Họ và tên(ghi chữ in hoa):</label>
            </td>
            <td>
                <form:input type="text" path="name"/>
            </td>
        </tr>

        <tr>
            <td>
                <label>Năm sinh:</label>
            </td>
            <td>
                <form:input type="date" path="birthYear"/>
            </td>
        </tr>

        <tr>
            <td>
                <label>Giới tính:</label>
            </td>
            <td>
                <form:select path="gender">
                    <form:option value="-Chọn-">-Chọn-</form:option>
                    <form:option value="nam">nam</form:option>
                    <form:option value="nữ">nữ</form:option>
                    <form:option value="giới tính thứ 3">giới tính thứ 3</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>
                <label>Quốc tịch:</label>
            </td>
            <td>
                <form:select path="nationality">
                    <form:option value="-quốc tịch-">-quốc tịch-</form:option>
                    <form:option value="Việt nam">Việt nam</form:option>
                    <form:option value="Nước khác">Nước khác</form:option>
                </form:select>
            </td>
        </tr>

        <tr>
            <td>CMND/CCCD/số hộ chiếu</td>
            <td>
                <form:input type="text" path="idCard"/>
            </td>
        </tr>

        <tr>
            <td>Thông tin đi lại:</td>
            <td>
                <form:radiobutton path="travelInfor" required="required" value="Máy bay"/>Máy bay
                <form:radiobutton path="travelInfor" required="required" value="tàu thuyền"/>tàu thuyền
                <form:radiobutton path="travelInfor" required="required" value="oto"/>oto
                <form:radiobutton path="travelInfor" required="required" value="Khác(Ghi rõ)"/>Khác(Ghi rõ)
            </td>
        </tr>

        <tr>
            <td>Số hiệu phương tiện:</td>
            <td>Số ghế:</td>
        </tr>
        <tr>
            <td><form:input type="text" path="idVehicle"/></td>
            <td><form:input type="text" path="seats"/></td>
        </tr>
        <tr>
            <td>Ngày khởi hành:</td>
            <td>Ngày kết thúc:</td>
        </tr>
        <tr>
            <td><form:input type="date" path="startDay"/></td>
            <td><form:input type="date" path="endDay"/></td>
        </tr>

        <tr>
            <td>Trong vòng 14 ngày qua, Anh/chị có đến thành phố nào?</td>
        </tr>
        <tr>
            <td>
                <form:textarea path="infoGoToIn14Day" type="text"/>
            </td>
        </tr>
        <td>
            <button type="submit">Submit</button>
        </td>

    </table>
</form:form>

</body>
</html>
