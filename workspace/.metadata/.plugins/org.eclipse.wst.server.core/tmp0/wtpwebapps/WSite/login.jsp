<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOGIN</title>
</head>
<body>
	<s:form action="LoginAction">
		<s:textfield name="loginUserId"/>
		<s:password name="loginPassword"/>
		<s:submit value="LOGIN"/>
	</s:form>
	
	<p><a href='<s:url action="UserCreateAction"/>'>USER CREATE</a></p>

</body>
</html>