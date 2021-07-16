<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/5/2021
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <head>
        <title>Edit Customer</title>
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
            </article>
            <article class="col-sm-9">
                <div class="tab-content">
                    <div class="container">
                        <p>
                            <a  href="/customer">Back to customer list</a>
                        </p>
                        <form method="post">
                            <div class="form-group">
                                <label>Customer Id:</label>
                                <input type="text" name="CustomerId" class="form-control" placeholder="CustomerId" value="${customer.getCustomerId()}"  readonly>
                            </div>
                            <div class="form-group">
                                <label >Customer Name:</label>
                                <input type="text" name="CustomerName" class="form-control"  placeholder="CustomerName:" value="${customer.getCustomerName()}">
                            </div>
                            <div class="form-group">
                                <label >Birthday:</label>
                                <input type="text"  name="CustomerBir" class="form-control"  placeholder="Birthday" value="${customer.getCustomerBir()}">
                            </div>
                            <div class="form-group">
                                <label >Gendet:</label>
                                <input type="text"  name="Gender" class="form-control"  placeholder="Gender" value="${customer.getGender()}">
                            </div>
                            <div class="form-group">
                                <label >Id Number:</label>
                                <input type="text"  name="CusIdNum" class="form-control"  placeholder="xxxxxxxxx" value="${customer.getCusIdNum()}">
                            </div>
                            <div class="form-group">
                                <label >Telephone Number:</label>
                                <input type="text"  name="CusTelNum" class="form-control"  placeholder="090-xxx-xxxx" value="${customer.getCusTelNum()}">
                            </div>
                            <div class="form-group">
                                <label >Email:</label>
                                <input type="text"  name="CusEmail" class="form-control"  placeholder="abc@gmail.com" value="${customer.getCusEmail()}">
                            </div>
                            <div class="form-group">
                                <label >Customer Type:</label>
                                <select name="CustomerTypeId" id="customerTypeId">
                                    <option value="${customer.getCustomerType().getCustomerTypeId()}">
                                        ${customer.getCustomerType().getCustomerTypeName()}
                                    </option>
                                    <c:forEach items="${customerTypes}" var="customerTypes">
                                        <option  value="${customerTypes.getCustomerTypeId()}">
                                                ${customerTypes.getCustomerTypeName()}
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label >Address:</label>
                                <input type="text"  name="Address" class="form-control"  placeholder="Address" value="${customer.getAddress()}">
                            </div>
                            <button type="submit" name="submit" class="btn btn-primary">Edit</button>
                        </form>
                    </div>
                </div>
            </article>
        </div>
    </nav>
</div>


</body>

</html>
