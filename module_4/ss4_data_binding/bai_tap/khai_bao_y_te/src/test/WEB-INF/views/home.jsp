<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Tờ khai y tế</h2>

<form:form modelAttribute="declaration" action="/home/update" method="post">
    <table>
        <tr>
            <td>
                <label>Họ và tên:</label>
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
                <label>Giới tính:</label>
            </td>

                <label>Quốc tịch:</label>

            <td>
                <label>Show:
                    <form:select path="size">
                        <form:option value="5">5</form:option>
                        <form:option value="10">10</form:option>
                        <form:option value="15">15</form:option>
                        <form:option value="25">25</form:option>
                        <form:option value="50">50</form:option>
                        <form:option value="100">100</form:option>
                    </form:select>
                    emails per page</label>
            </td>
        </tr>

        <tr>
            <td>Spams filters:</td>
            <td><form:checkbox path="spamFilter" value="Enable spams filter"/>Enable spams filter</td>
        </tr>


        <tr>
            <td>Signature:</td>
            <td>
                <form:textarea rows="4" cols="50" path="signature"/>
            </td>
        </tr>
            <td><button type="submit">Update</button></td>
            <td><button type="reset">Cancel</button></td>
    </table>
</form:form>

</body>
</html>
