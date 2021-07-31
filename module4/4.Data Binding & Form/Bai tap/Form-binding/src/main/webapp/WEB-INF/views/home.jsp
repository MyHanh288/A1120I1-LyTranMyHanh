<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/21/2021
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Mail</title>
</head>
<body>
<h1>Settings</h1>

<form:form action="home" method="post" modelAttribute="Mail" >
    <fieldset>
        <legend>Mail</legend>
        <table>
            <tr>
                <td><label>Languages:</label></td>
                <td>
                    <form:select path="language">
                        <form:option value="None">None</form:option>
                        <form:options items="${language}"></form:options>
                    </form:select></td>
            </tr>
            <tr>
                <td><label>Size:</label></td>
                <td><form:select path="size">
                    <form:option value="0">0</form:option>
                    <form:options items="${size}"></form:options>
                </form:select></td>
            </tr>
            <tr>
                <td><label>Spam:</label></td>
                <td><form:checkbox path="spam"></form:checkbox></td>
            </tr>
            <tr>
                <td><label>Signature:</label></td>
                <td><form:textarea path="signature"></form:textarea></td>
            </tr>
            <td></td>
            <td><form:button>Update</form:button></td>
        </table>
    </fieldset>
</form:form>

</body>
</html>
