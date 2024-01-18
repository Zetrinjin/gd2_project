<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="header.jsp"%>


<div >
    <h3>Добро пожаловать в регистрацию</h3>

    <form method="post" action="/web/saveUser" >
        <label for="username">Логин:</label>
        <input type="text" id="username" name="username" required ><br>

        <label for="name">Имя:</label>
        <input type="text" id="name" name="name" required ><br>

        <label for="password">Пароль:</label>
        <input type="text" id="password" name="password" required ><br>

        <input type="submit" value="Зарегистрироваться" >
    </form>
</div>


<%@include file="footer.jsp"%>