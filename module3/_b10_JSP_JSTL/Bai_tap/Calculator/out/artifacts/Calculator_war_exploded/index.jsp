<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/7/2021
  Time: 5:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h2>Simple Calculator</h2>
  <form method="post" action="/calculator">
    <fieldset>
      <legend>Calculator</legend>
      <table class="table">
        <tr>
          <td>First operand : </td>
          <td><input name="firstOperand" type="text"></td>
        </tr>
        <tr>
          <td>Operator : </td>
          <td>
            <select name="operator">
              <option value="+">Addition</option>
              <option value="-">Subtraction</option>
              <option value="*">Multiplication</option>
              <option value="/">Division</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>Second operand : </td>
          <td><input name="secondOperand" type="text"></td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" id="submit" name="Calculator"></td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
</html>
