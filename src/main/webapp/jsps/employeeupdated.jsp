<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Successful update</title>
</head>
<body>

    <h1>Employee's Updated Details</h1>
    <p>${employee.firstname}</p>
    <p>${employee.lastname}</p>
    <a href="${pageContext.request.contextPath}/jsps/employeesmenu.jsp">Return</a>

</body>
</html>