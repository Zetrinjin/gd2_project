<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="header.jsp"%>



<div>
<form method="post"  action="/web/credits">
 <legend>Создание кредита</legend>

  <label for="sumCredit">сумма кредита:</label><br>
  <input type="text" id="sumCredit" name="sumCredit" ><br><br>
  <label for="creditPercent"> Валюта:</label>

                          <select id="creditPercent" name="creditPercent" required >*
                                      <option value="2">2%</option>
                                      <option value="5">5%</option>
                                      <option value="8">8%</option>

                          </select>
  <input type="submit" value="стать рабом!">
</form>


 </div>



<%@include file="footer.jsp"%>