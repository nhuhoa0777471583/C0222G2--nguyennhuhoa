<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="email" action="/home/update" method="post">
    <table>
        <tr>
            <td>
                <label>Languages:</label>
            </td>
            <td>
                <form:select  path="language" >
                    <option>Choose a Languages:</option>
                    <form:option value="english">English</form:option>
                    <form:option value="vietnam">Vietnamese</form:option>
                    <form:option value="japanese">Japanese</form:option>
                    <form:option value="chinese">Chinese</form:option>
                </form:select>
            </td>
        </tr>

        <tr>
            <td>
                <label>Page Size:</label>
            </td>
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

<table border="0.3">
    <tr>
        <td>Language:</td>
        <td>${e.language}</td>
    </tr>

    <tr>
        <td>Page Size:</td>
        <td>${e.size}</td>
    </tr>
    <tr>
        <td>Spam Filter:</td>
        <td>${e.spamFilter}</td>
    </tr>
    <tr>
        <td>Signature:</td>
        <td>${e.signature}</td>
    </tr>
</table>
</body>
</html>
