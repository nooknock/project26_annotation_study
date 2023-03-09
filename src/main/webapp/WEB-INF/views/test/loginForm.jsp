<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
  request.setCharacterEncoding("UTF-8");
%>   

<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="${contextPath}/test/login.do">
아이디:<input type="text" name="userID"><br>
이름:<input type="text" name="userName"><br>
<input type="submit" value="로그인">
<input type="reset" value="초기화"> 
</form>
</body>
</html>