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
    <title>Them moi</title>
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
        <a  href="/user">Tro lai danh sach User</a>
    </p>
    <form method="post">
        <div class="form-group">
            <label >Name</label>
            <input type="text" name="name" class="form-control"   placeholder="UserName">
        </div>
        <div class="form-group">
            <label >Email</label>
            <input type="text" name="email" class="form-control"  placeholder="Email">
        </div>
        <div class="form-group">
            <label >Password</label>
            <input type="text"  name="country" class="form-control"  placeholder="Country">
        </div>
        <button type="submit" name="submit" class="btn btn-primary">Add</button>
    </form>
</div>
</body>
</html>
