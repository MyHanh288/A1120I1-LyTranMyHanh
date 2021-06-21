<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/16/2021
  Time: 8:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <p>
        <a href="/user?action=create"> Them moi User</a>
    </p>
    <p>
        <a href="/user?action=search"> Search</a>
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
