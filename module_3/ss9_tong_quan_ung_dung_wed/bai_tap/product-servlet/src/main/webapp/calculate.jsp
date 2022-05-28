<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/5/2022
  Time: 12:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String description = request.getParameter("description");
    Float price = Float.parseFloat(request.getParameter("price"));
    Float precent = Float.parseFloat(request.getParameter("precent"));
    double discountAmount = price * precent * 0.01;
    double total = price - discountAmount;
%>
 <h2>Tên sản phẩm: <%=description%></h2>

 <h2>giá: <%=price%></h2>

 <h2>Tỷ lệ chiết khấu</h2>: <%=precent%></h2>

 <h2>giá chiết khấu: <%=discountAmount%></h2>

 <h2>Tổng tiền: <%=total%></h2>

</body>
</html>
