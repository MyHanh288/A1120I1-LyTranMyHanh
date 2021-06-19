<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/14/2021
  Time: 3:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hien thi danh sach</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/customers?action=create">Them moi khach hang</a>
</p>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>

    <c:forEach items="${customers}" var="customers">
        <tr>
            <td>
                <a href="/customers?action=view&id=${customers.getId()}}">${customers.getName()}</a>
            </td>
            <td>
                    ${customers.getEmail()}
            </td>
            <td>
                    ${customers.getAddress()}
            </td>
            <td>
                <a href="/customers?action=edit&id=${customers.getId()}">edit</a>
            </td>
            <td>
                <a href="/customers?action=delete&id=${customers.getId()}">delete</a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
