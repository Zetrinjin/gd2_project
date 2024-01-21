<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="header.jsp"%>


<div >
    <h3>Окно транзакции карты</h3>

    <form method="post"  action="/web/transaction" >
        <label for="cardSender">введите вашу карту:</label>
        <input type="text" id="cardSender" name="cardSender" required ><br>


        <label for="cardRecipient">введите карту для перевода:</label>
        <input type="text" id="cardRecipient" name="cardRecipient" required ><br>

        <label for="transactionSum">введите сумму перевода:</label>
        <input type="text" id="transactionSum" name="transactionSum" required ><br>

        <input type="submit" value="Перевести" >
    </form>
</div>


<%@include file="footer.jsp"%>