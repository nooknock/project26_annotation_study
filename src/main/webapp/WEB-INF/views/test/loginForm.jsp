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



<form method="post" action="${contextPath}/test/login2.do">
<!-- <input type="hidden" name="email" value="hong@test.com"> -->
아이디:<input type="text" name="userID"><br>
이름:<input type="text" name="userName"><br>
<!-- 이름:<input type="text" name="userName123123"><br> --><!-- 이런식으로 일치하는 파라미터가 name이 없으면 오류발생하는데-->
e멜:<input type="text" name="email12312"><br><!--  @RequestParam(required=false)로 하면 null값이 나오고 에러는 안 남 -->
<input type="submit" value="로그인">
<input type="reset" value="초기화"> 
</form>


<form method="post" action="${contextPath}/test/login3.do">
<!-- <input type="hidden" name="email" value="hong@test.com"> -->
아이디:<input type="text" name="userID"><br>
이름:<input type="text" name="userName"><br>
<!-- 이름:<input type="text" name="userName123123"><br> --><!-- 이런식으로 일치하는 파라미터가 name이 없으면 오류발생하는데-->
e멜:<input type="text" name="email12312"><br><!--  @RequestParam(required=false)로 하면 null값이 나오고 에러는 안 남 -->
<input type="submit" value="로그인">
<input type="reset" value="초기화"> 
</form>


<form method="post" action="${contextPath}/test/login4.do">
<!-- <input type="hidden" name="email" value="hong@test.com"> -->
아이디:<input type="text" name="userID"><br>
이름:<input type="text" name="userName"><br>
<!-- 이름:<input type="text" name="userName123123"><br> --><!-- 이런식으로 일치하는 파라미터가 name이 없으면 오류발생하는데-->
e멜:<input type="text" name="email12312"><br><!--  @RequestParam(required=false)로 하면 null값이 나오고 에러는 안 남 -->
<input type="submit" value="로그인">
<input type="reset" value="초기화"> 
</form>



</body>
</html>