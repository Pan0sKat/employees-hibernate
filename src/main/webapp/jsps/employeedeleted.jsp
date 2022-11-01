<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee Form</title>
</head>
<body>

    <p>Employee: ${employee.id} ${employee.firstname} ${employee.lastname}</p>
    <p>deleted successfully</p><br>
    
    <a href="${pageContext.request.contextPath}/jsps/employeesmenu.jsp">Return</a>

</body>
</html>