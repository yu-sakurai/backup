<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BUY CONFIRM</title>
</head>
<body>
	<h3>SUCCESS</h3>
	<s:form action="BuyItemConfirmAction">
		<tr>
			<td>商品名</td>
			<td><s:property value="session.buyItem_name"/>
			</td>
		</tr>
		<tr>
			<td>商品名</td>
			<td><s:property value="session.total_price"/>
			</td>
		</tr>
		<tr>
			<td>商品名</td>
			<td><s:property value="session.count"/>
			</td>
		</tr>
		<tr>
			<td>商品名</td>
			<td><s:property value="session.pay"/>
			</td>
		</tr>
		<tr>
			<td><s:submit value="SUBMIT"/></td>
		</tr>
	</s:form>
</body>
</html>