<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/14/2021
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Chinh sua thong tin khach hang</h1>
<p>
    <c:if test="${message != null}">
        <span class="message">
                ${message}
        </span>
    </c:if>
</p>
<p>
    <a href="/customers" >Quay lai danh sach khach hang</a>
</p>
<form method="post">
    <fieldset>
        <legend>Thong tin khach hang</legend>
        <label>name:</label>
        <input type="text" name="name" value="${customer.getName()}">
        <br/>
        <label>email:</label>
        <input type="text" name="email" value="${customer.getEmail()}">
        <br/>
        <label>address:</label>
        <input type="text" name="address" value="${customer.getAddress()}">
        <br/>
        <input type="submit" value="Edit">
    </fieldset>
</form>
</body>
</html>
