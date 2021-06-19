<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/14/2021
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Them moi khach hang</h1>
<p>
    <c:if test="${message != null }">
        <span class="message">${message}</span>
    </c:if>
</p>
<a href="/customers" >Quay lai danh sach khach hang</a>
</p>
<form method="post">
    <fieldset>
        <legend>Thong tin khach hang</legend>
        <label>Name:</label>
        <input type="text" name="name">
        <br/>
        <label>Email:</label>
        <input type="text" name="email">
        <br/>
        <label>Address:</label>
        <input type="text" name="address">
        <br/>
        <input type="submit" name="submit" value="update">
    </fieldset>
</form>
</body>
</html>
