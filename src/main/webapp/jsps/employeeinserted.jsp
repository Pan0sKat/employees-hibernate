<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Successful insertion</title>
</head>
<body>
	<h1>Employee inserted successfully</h1>
	<div>
		<p>${insertedemployee.firstname}</p>
		<p>${insertedemployee.lastname}</p>
	</div>
	
	<a href="${pageContext.request.contextPath}/jsps/employeesmenu.jsp">Return to menu</a>
</body>
</html>