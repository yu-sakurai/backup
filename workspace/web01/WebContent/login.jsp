<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>
	<s:form action="LoginAction">
		<s:textfield name="username"/>
		<s:password name="password"/>
		<s:submit value="login"/>
	</s:form>
</body>
</html>