<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/14/2021
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <c:if test="${message != null }">
        <span class="message">${message}</span>
    </c:if>
</p>
<p>
    <a href="/customers" >Quay lai danh sach khach hang</a>
</p>
<form method="post">
    <h3>Ban co chac muon xoa khong?</h3>
    <fieldset>
        <legend>Thong tin khach hang</legend>
        <label> Name:</label>
        <p> ${customer.getName()}</p>
        <br/>
        <label> Email:</label>
        <p> ${customer.getEmail()}</p>
        <br/>
        <label> Address:</label>
        <p> ${customer.getAddress()}</p>
        <br/>
        <input type="submit" name="submit" value="Agree">
        <br/>
        <a href="/customers" >Quay lai danh sach khach hang</a>
    </fieldset>
</form>
</body>
</html>
