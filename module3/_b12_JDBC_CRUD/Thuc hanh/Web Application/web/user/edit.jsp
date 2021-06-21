<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/21/2021
  Time: 8:16 AM
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
        <a  href="/user">Tro lai danh sach User</a>
    </p>
    <form method="post">
        <h2>Chinh sua thong tin user</h2>
        <div class="form-group">
            <label >Name</label>
            <input type="text" name="name"class="form-control" value="${user.getName()}">
        </div>
        <div class="form-group">
            <label >Email</label>
            <input type="text" name="email" class="form-control"  value="${user.getEmail()}">
        </div>
        <div class="form-group">
            <label >Country</label>
            <input type="text"  name="country" class="form-control"   value="${user.getCountry()}">
        </div>
        <button type="submit" name="submit" class="btn btn-primary">Edit</button>
    </form>
</div>
</body>
</html>
