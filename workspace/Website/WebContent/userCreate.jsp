<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USER CREATE</title>
</head>
<body>
	<h3>SUCCESS</h3>
	<div>
	<s:if test="errorMassage != ''">
				<s:property value="errorMassage" escape="false" />
	</s:if>
	<table>
	<s:form action="UserCreateConfirmAction">
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
				<label>PASSWORD</label>
			</td>
			<td>
				<input type="text" name="loginPassword" value=""/>
			</td>
		</tr>
		<tr>
			<td>
				<label>USER NAME</label>
			</td>
			<td>
				<input type="text" name="userName" value=""/>
			</td>
			<s:submit value="submit"/>
		</tr>
	</s:form>
	</table>
	<div>
		<span>BACK</span><a href='<s:url action="HomeAction"/>'>BACK</a>
	</div>
	</div>		
	

</body>
</html>