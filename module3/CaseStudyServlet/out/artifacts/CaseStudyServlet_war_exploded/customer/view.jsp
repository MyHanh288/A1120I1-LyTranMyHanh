<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/5/2021
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Customer Details </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container-fluid">
     <nav >
        <div class="row container">
            <article class="col-sm-3">
                <a class="nav-link " href="/customer">View customer list</a>
                <a class="nav-link " href="/customer?action=create">Add new customer</a>
                <a class="nav-link " href="/customer?action=search">Search customer</a>
            </article>
            <article class="col-sm-9">
                <div class="tab-content">
                    <div>
                        <table class="table table-hover" id="customerTable">
                            <tr>
                                <th>Customer Id</th>
                                <th>Customer Name</th>
                                <th>Birthday</th>
                                <th>Gender</th>
                                <th>Id Number</th>
                                <th>Telephone Number</th>
                                <th>Email</th>
                                <th>Customer Type</th>
                                <th>Address</th>
                            </tr>
                            <tr>
                                <td>${customer.getcustomerId()}</td>
                                <td>${customer.getcustomerName()}</td>
                                <td>${customer.getcustomerBir()}</td>
                                <td>${customer.getgender()}</td>
                                <td>${customer.getcusIdNum()}</td>
                                <td>${customer.getcusTelNum()}</td>
                                <td>${customer.getcusEmail()}</td>
                                <td>${customer.getcustomerType().getcustomerTypeName()}</td>
                                <td>${customer.getaddress()}</td>
                            </tr>
                        </table>
                    </div>
                </div>
            </article>
        </div>
    </nav>
</div>
</body>

</html>
