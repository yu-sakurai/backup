<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INDEX</title>
</head>
<body>
	<form action="HelloStrutsAction">
		<s:submit value="HelloStruts"/>
	</form>
	<form action="WelcomeAction">
		<s:submit value="Welcome"/>
	</form>
	<form action="InquiryAction">
		<s:submit value="お問い合わせ"/>
	</form>
	
	<br>
	GET通信
	<s:form method="get" action="TestAction">
	<s:textfield name="username"/>
	<s:password name="password"/>
	<s:submit value="送信"/>
	</s:form>
	
	POST通信
	<s:form method="post" action="TestAction">
		<s:textfield name="username"/>
		<s:password name="password"/>
		<s:submit value="送信"/>
	</s:form>
</body>
</html>