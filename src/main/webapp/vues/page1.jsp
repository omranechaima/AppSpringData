<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Liste des Produits</h1>
<table>
<c:forEach items="${liste}" var="prod"> </c:forEach>
<tr><td>${prod.num }</td> <td>${prod.desc }</td>  <td>${prod.d }</td>  <td>${prod.q }</td>  <td>${prod.pa }</td>  <td>${prod.pv }</td> </tr>
</table>
</body>
</html>