<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/25/2021
  Time: 7:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
      <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <title>Home</title>
  </head>
  <body>
  <div class="container" style = "height: auto">
      <header class="row">
          <img class="col-sm-4" src="image/images.jpg" />
          <div class="col-sm-8 furama">
              <h1>Welcome to Furama Resort</h1>
          </div>
      </header>
      <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
          <a class="navbar-brand" href="#">Home</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon">🏠</span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="nav nav-tabs mr-auto">
                  <li class="nav-item">
                      <a class="nav-link "  style="background: black; color: white" href="/employee">Employee</a>
                  </li>
                  <li class="nav-item">
                      <a class="nav-link" style="background: black; color: white" href="/customer">Customer</a>
                  </li>
                  <li class="nav-item">
                      <a class="nav-link" style="background: black; color: white" href="/service">Service</a>
                  </li>
                  <li class="nav-item ">
                      <a class="nav-link " style="background: black; color: white" href="/contract">Contract</a>
                  </li>
              </ul>
              <ul class="navbar-nav mr-right">
                  <li class="nav-item">
                      <form method="post" action="${search}?action=search">
                          <input type="search" name="name" placeholder="search?" aria-describedby="button-addon4" class="form-control border-0" value="Search">
                      </form>
                  </li>
              </ul>
          </div>
      </nav>
      <div class = "row">
          <article class="col-sm-9">
          </article>
          <aside class="col-sm-3">
          </aside>
      </div>
      <footer class="card">
          <div class = "card-header text-center">
              <p>Design by MH</p>
          </div>
      </footer>
  </div>
  </body>
</html>
