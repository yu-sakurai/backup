<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:property value="session.createUserId"/><br>
	<s:property value="session.createUserPassword"/><br>
	<s:property value="session.createUserName"/><br>
	<s:form action="UserCreateCompleteAction">
		<s:submit value="COMPLETE"/>
	</s:form>
</body>
</html>