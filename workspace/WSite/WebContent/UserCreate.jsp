<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>USER CREATE</title>
</head>
<body>
	<s:form action="UserCreateConfirmAction">
		<table>
			<tr>
				<td>
					<label>LOGIN ID</label>
				</td>
				<td>
					<input type="text" name="loginUserId" value=""/>
				</td>
			
			</tr>
			<tr>
				<td>
					<label>LOGIN PASSWORD</label>
				</td>
				<td>
					<input type="password" name="loginUserPassword" value=""/>
				</td>
			
			</tr>
			<tr>
				<td>
					<label>USER NAME</label>
				</td>
				<td>
					<input type="text" name="userName" value=""/>
				</td>
			</tr>
		</table>
		<s:submit value="CREATE"/>
	</s:form>
</body>
</html>