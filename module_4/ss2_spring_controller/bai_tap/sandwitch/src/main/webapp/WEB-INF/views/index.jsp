<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form method="get" action="/spice/list">
    <input type="checkbox" name="spice" value="lettuce">lettuce
    <input type="checkbox" name="spice" value="tomato">tomato
    <input type="checkbox" name="spice" value="mustard">mustard
    <input type="checkbox" name="spice" value="sprouts">sprouts
    <button type="submit" value="Submit">Submit</button>
</form>

<div>
<c:forEach items="${spice}" var="s">
    <h2>Spice Sandwich: ${s}</h2>
</c:forEach>
</div>

</body>
</html>
