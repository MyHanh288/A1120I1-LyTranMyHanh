<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/6/2021
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="/css/bootstrap.css">

</head>
<body>
<h2>Danh sach khach hang</h2>
<table class="table">
    <thead>
    <tr>
        <th>Ten</th>
        <th>Ngay sinh</th>
        <th>Dia chi</th>
        <th>Anh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="customer">
    <tr>
        <td>${customer.name}</td>
        <td>${customer.birthday}</td>
        <td>${customer.address}</td>
        <td>
            <img src="/image/${customer.image}" width="50" height="50">
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
