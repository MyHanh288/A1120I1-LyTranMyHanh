<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/16/2021
  Time: 8:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hien thi Users</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <p>
        <a href="/user?action=create"> Them moi User</a>
    </p>
    <p>
        <a href="/user?action=search"> Tim kiem theo ten </a>
    </p>
    <p>
        <a href="/user?action=qg">Tim kiem theo quoc gia</a>
    </p>
    <p>
        <a href="/user?action=sort"> Sap xep tang dan theo ten </a>
    </p>
    <h2>Danh sach User</h2>

    <table class="table table-hover">
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Country</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                    <td>${user.country}</td>
                    <td>
                        <a href="/user?action=edit&id=${user.getId()}">Edit</a>
                    </td>
                    <td>
                        <a href="/user?action=edit&id=${user.getId()}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
</div>
</body>
</html>
