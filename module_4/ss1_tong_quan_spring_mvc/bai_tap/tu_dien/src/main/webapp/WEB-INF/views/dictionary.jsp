<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/6/2022
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/result" method="get">
    <table>
        <tr>
            <td>English :</td>
            <td><input type="text" name="e" value="${e}"></td>
        </tr>
    </table>
    <button>Dictionary Search</button>
</form>


<h3>Việt Nam : ${vn}</h3>
</body>
</html>
