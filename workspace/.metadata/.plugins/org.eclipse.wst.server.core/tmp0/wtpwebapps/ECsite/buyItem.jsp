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
	<h3>SUCCESS</h3>
	<s:property value="session.loginId"/><br>
	<s:property value="session.loginUserPassword"/><br>
	<s:property value="session.id"/><br>

	<s:form action="BuyItemAction">
		<s:property value="session.buyItem_name"/><br>
		<s:property value="session.buyItem_price"/><br>
		<s:property value="session.buyItem_stock"/><br>


			<%-- <select name="count">
				<option value="a">選択してください</option>
					<script type="text/javaScript" language="javaScript">
					<%@ taglib prefix="s" uri="/struts-tags" %>
					for(var i=0;i<=<s:property value="session.buyItem_stock"/>;i++){
					document.write("<option value='z'>");
					document.write(i);
					document.write("</option>");
					}
					</script>
			</select> --%>
			<input type="radio" name="pay" value="1" checked="checked"/>現金
			<input type="radio" name="pay" value="2"/>クレジット
		<s:submit value="CONFIRME"/>
	</s:form>
	<a href='<s:url action="MyPageAction"/>'>MyPAGE</a>
</body>
</html>