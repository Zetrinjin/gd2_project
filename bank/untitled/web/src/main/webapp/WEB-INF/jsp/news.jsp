<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<%@include file="header.jsp"%>



<div>
    <table border="1" >
        <thead>
        <tr>
            <th>News ID</th>
            <th>News title</th>
            <th>News headline</th>
        </tr>
        </thead>

        <tbody>
             <c:forEach var="news" items="${newsList}" >
                                <tr>
                                    <td> <c:out value="${news.id}"  default="Hello world"/></td>
                                    <td><c:out value="${news.title}" /></td>
                                    <td><c:out value="${news.headline}" /></td>

                                </tr>
                            </c:forEach>
        </tbody>
    </table>
</div>







<%@include file="footer.jsp"%>