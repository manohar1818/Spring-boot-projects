<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${article}

   <body>
      <c:forEach var = "i" begin = "0" end = "2">
         <c:out value = "${article}"/><p>
         
      </c:forEach>

</body>
</html>