<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/30/2021
  Time: 6:53 PM
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
        <a  href="/customerType">Tro lai danh sach CustomerType</a>
    </p>
    <form method="post">
        <div class="form-group">
            <label >CustomerTypeId</label>
            <input type="text" name="id" class="form-control"   placeholder="CustomerTypeId">
        </div>
        <div class="form-group">
            <label >CustomerTypeName</label>
            <input type="text" name="name" class="form-control"  placeholder="CustomerTypeName">
        </div>
        <button type="submit" name="submit" class="btn btn-primary">Add</button>
    </form>
</div>
</body>
</html>
