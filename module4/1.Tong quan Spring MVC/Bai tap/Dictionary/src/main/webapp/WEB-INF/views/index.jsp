
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form method="post" action="/dictionary">
    <input type="text" name="word" value="Enter your word :">
    <input type="submit" id="submit" value="Search">
  </form>
  <p>${vietnamese}</p>
  </body>
</html>
