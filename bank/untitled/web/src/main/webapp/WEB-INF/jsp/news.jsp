<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="header.jsp"%>



 <table border="1" class="table table-striped table-responsive-md">
            <thead>
                <tr>
                    <th>News id</th>
                    <th>News title </th>
                    <th>News headline</th>
                </tr>
            </thead>
            <tbody>
                <tr th:each="news : ${newsList}">
                    <td th:text="${news.newsid}"></td>
                    <td th:text="${news.title}"></td>
                    <td th:text="${news.headline}"></td>
                </tr>
            </tbody>
        </table>





<div style="text-align: center;">
    <ul class="pagination" style="display: inline-block;">
        <li class="page-item ${currentPage == 1 ? 'disabled' : ''}">
                    <a class="page-link" href="/news/${currentPage - 1 > 0 ? currentPage - 1 : 1}" aria-label="Предыд">
                        <span aria-hidden="true">«</span>
                    </a>
                </li>
        <li class="page-item ${currentPage == totalPages ? 'disabled' : ''}">
                    <a class="page-link" href="/news/${currentPage + 1 <= totalPages ? currentPage + 1 : totalPages}" aria-label="След">
                        <span aria-hidden="true">»</span>
                    </a>
                </li>

    </ul>
</div>


<%@include file="footer.jsp"%>