<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>alpha.jsp</title>
</head>
<body>
<h1>Alpha Form 실습</h1>
<hr>
<table>
 <tbody>
  <c:forEach var="row" items="${alphas }">
  <tr>
    <c:forEach var="alpha" items="${row }">
     <td>${alpha.ch }</td>
    </c:forEach>
  </tr>
  </c:forEach>
 </tbody>
</table>
<hr>
<table>
 <c:forEach var="i" begin="0" end="19">
  <tbody>
   <tr>
   <c:forEach var="j" begin="0" end="39">
       <td>${alphas[i][j].ch }</td>
   </c:forEach>
   </tr>
  </tbody>
 </c:forEach>
</table>

</body>
</html>