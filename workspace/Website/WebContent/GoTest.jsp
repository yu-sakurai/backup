<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SUCCESS</title>
</head>
<body>
	<s:form action="LoginAction">
		<s:textfield name="loginUserId"/>
		<s:password name="loginPassword"/>
		<s:submit value="LOGIN"/>
	</s:form>
	
	<br/>
	<div>
		<span>USER CREATE<a href='<s:url action="UserCreateAction"/>'>こちら</a></span>
	</div>
</body>
</html>