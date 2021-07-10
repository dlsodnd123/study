<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String str = request.getParameter("msg");
	%>
	
	<c:catch var="e">
		<%
			if(str.equals("add")) {
				out.print(str);
			}
		%>
	</c:catch>
	<c:out value="${e}" />
</body>
</html>