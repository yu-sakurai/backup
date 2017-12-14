<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>USER CREATE CONFIRM</title>
</head>
<body>
	<H3>SUCCESS</H3>
	<div>
	<table>
		<s:form action="UserCreateCompleteAction">
			<tr>
				<td>
					<label>LOGIN ID</label>
				</td>
				<td>
					<s:property value="loginUserId" escape="false"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>LOGIN PASSWORD</label>
				</td>
				<td>
					<s:property value="loginPassword" escape="false"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>USER NAME</label>
				</td>
				<td>
					<s:property value="userName" escape="false"/>
				</td>
			</tr>
			<tr>
				<td>
					<s:submit value="COMPLETE"/>
				</td>
			</tr>
		</s:form>
	</table>
	</div>
</body>
</html>