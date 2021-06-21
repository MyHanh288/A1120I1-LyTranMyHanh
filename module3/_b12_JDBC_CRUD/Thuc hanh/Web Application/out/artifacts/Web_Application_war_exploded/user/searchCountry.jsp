<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/21/2021
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <p>
        <a  href="/user">Tro lai danh sach User</a>
    </p>
    <form method="post">
        <label>Nhap quoc gia ban muon tim kiem</label>
        <input type="text" name="country">
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
