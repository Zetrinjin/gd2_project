<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="header.jsp"%>



<div>
<form action="/web/cards">
  <label for="currency">Сurrency:</label><br>
 <form>
   <input type="radio" id="Byn" name="currency" value="BYN">
   <label for="BYN">BYN</label>
   <input type="radio" id="Usd" name="currency" value="USD">
   <label for="USD">USD</label>
   <input type="radio" id="Rub" name="currency" value="RUB">
   <label for="RUB">RUB</label>
 </form>
 <label for="credit_period">Credit period:</label><br>
  <input type="number" id="period" name="period" ><br>
  <label for="credit_sum">Credit sum:</label><br>
  <input type="number" id="credit_sum" name="credit_sum" ><br><br>
  <input type="submit" value="Submit">
</form>
 </div>

<%@include file="footer.jsp"%>