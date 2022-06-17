
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Calculator</h2>

<form method="post" action="/home/calculator">
    <input type="text" value="${number1}" name="number1">
    <input type="text" value="${number2}" name="number2">
    <button type="submit" name="calculation" value="addtion">Addtion(+)</button>
    <button type="submit" name="calculation" value="subtraction">Subtraction(-)</button>
    <button type="submit" name="calculation" value="multiplication">Multiplication(*)</button>
    <button type="submit" name="calculation" value="division">Division(/)</button>
</form>


<div>
    <h2>Result : ${result}</h2>
</div>
</body>
</html>
