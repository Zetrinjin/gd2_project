<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="header.jsp"%>



 <form  method="post" action="/web/account">
                    <fieldset>
                        <legend>Создание аккаунта</legend>

                        <label for="name"> Имя</label>
                        <input type="text" name="name" id="name"  required>*


                        <br><br>
                        <label for="lname">Фамилия</label>
                        <input type="text" name="lname" id="lname" required>*

                        <br><br>
                        <label for="tel">Телефон</label>
                        <input type="tel" name="tel" id="tel" required>*

                        <br><br>
                        <label for="email">E-mail</label>
                        <input type="email" name="mail" id="mail" required>*


                        <br>

                        <input type="checkbox" name="saveuser">Остаться в системе
                        <br>

                        <em>* - обязательное поле</em>
                        <br><br>
                        <input type="submit" value="Регистрация">



                    </fieldset>
                </form>


<%@include file="footer.jsp"%>