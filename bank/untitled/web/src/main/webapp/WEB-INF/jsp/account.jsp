<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="header.jsp"%>



 <form  method="post" action="/web/account">
                    <fieldset>
                        <legend>Создание аккаунта</legend>

                        <label for="accountCurrency"> Валюта:</label>

                         <select id="accountCurrency" name="accountCurrency" required >*
                                    <option value="usd">USD</option>
                                    <option value="byn">BYN</option>
                                    <option value="rub">RUB</option>

                         </select>

                        <em>* - обязательное поле</em>
                        <br><br>
                        <input type="submit" value="Регистрация">

                    </fieldset>
                </form>


<%@include file="footer.jsp"%>