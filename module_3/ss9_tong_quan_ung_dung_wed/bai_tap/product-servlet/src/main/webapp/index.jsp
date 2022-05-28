<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/5/2022
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>Product Discount Calculator </title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<form action="calculate.jsp" method="post">

  Product Description <input type="text" name="description" placeholder="enter: "/>
  <br>
  List Price:<input type="text" name="price" placeholder="enter: "/>
  <br>
  Discount Percent:<input type="text" name="precent" placeholder="enter: "/>
  <br>
  <input type = "submit" id = "submit" value = "calculate"/>

</form>
</body>
</html>
