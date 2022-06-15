<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/6/2022
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Chuyển đổi tiền tệ</h2>
<form action="/result" method="get">
    <table>

        <td>
            <label>USD</label>
            <input type="text" name="usd" value="${usd}">
        </td>

        <td>
           <label>Rate : </label>
            <input value="23000" name="rate">
        </td>

        <td>
            <button>Currency Conversion</button>
        </td>
    </table>
</form>

<h2>VND : ${vnd}</h2>
</body>
</html>
