<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Liste des Magasins</h1>
<table>
<c:forEach items="${liste1}" var="mag"> </c:forEach>
<tr><td>${mag.id }</td> <td>${mag.nom }</td>  <td>${mag.lieu }</td>  </tr>
</table>

</body>
</html>