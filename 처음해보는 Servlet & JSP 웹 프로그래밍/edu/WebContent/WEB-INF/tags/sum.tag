<%@ tag language="java" body-content="empty" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="num1" required="true" %>
<%@ attribute name="num2" required="true" %>
<%@ variable name-given="result" variable-class="java.lang.Long" scope="AT_END" %>

<c:set var="result" value="${num1+num2}" />