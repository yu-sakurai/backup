<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせ　受付完了</title>
</head>
<body>
	<br>
	<s:property value="name"/>サン、ありがとうございました。
	<br>
	<br>お問い合わせの種類<br>
		<s:if test='qtype=="support"'>
			アフターサポートについて
		</s:if>
	<br>お問い合わせ内容<br>
		<s:property value="body"/>
</body>
</html>