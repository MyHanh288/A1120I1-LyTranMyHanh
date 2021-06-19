<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/14/2021
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <a href="/customers" >Quay lai danh sach khach hang</a>
</p>
<label>Name</label>
<p>
    ${customer.getName()}
</p>

<label>Email</label>
<p>
    ${customer.getEmail()}
</p>

<label>Address</label>
<p>
    ${customer.getAddress()}
</p>
</body>
</html>
