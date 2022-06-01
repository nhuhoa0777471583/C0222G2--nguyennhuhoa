<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete</h1>
<p>
  <a href="/product">thoát</a>
</p>
<form method="post">
<h3>Are you sure?</h3>
<fieldset>
    <table>
        <tr>
            <td>tên:</td>
            <td>${product.getName()}</td>
        </tr>
        <tr>
            <td>giá:</td>
            <td>${product.getGia()}</td>
        </tr>
        <tr>
            <td>mô tả:</td>
            <td>${product.getMoTa()}</td>
        </tr>
        <tr>
            <td>nhà sản xuất:</td>
            <td>${product.getNhaSanXuat()}</td>
        </tr>
        <tr>
            <td><input type="submit" value="Delete product"></td>
            <td><a href="/product">Back to product list</a></td>
        </tr>
    </table>
</fieldset>



</form>
</body>
</html>
