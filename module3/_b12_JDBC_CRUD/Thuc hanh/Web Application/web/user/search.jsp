<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/21/2021
  Time: 8:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Tim kiem theo ten</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div>
    <p>
        <a  href="/user">Tro lai danh sach User</a>
    </p>
    <form method="post">
        <label>Nhap ten user ban muon tim kiem</label>
        <input type="text" name="name">
        <button type="submit" name="submit">Search</button>
    </form>
    <div>
        <table class="table table-hover">
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Country</th>

            </tr>
            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>${user.getName()}</td>
                    <td>${user.getEmail()}</td>
                    <td>${user.getCountry()}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
