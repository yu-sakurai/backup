<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"></script>
</head>
<body>
	<h3>SUCCESS</h3>
<%-- 	<s:property value="session.loginId"/><br>
	<s:property value="session.loginUserPassword"/><br>
	<s:property value="session.id"/><br> --%>

	<table border="1">
			<tr>
				<th>商品名</th>
				<th>値段</th>
				<th>在庫</th>
			</tr>
			<s:iterator value="buyItemList">
				<tr>
					<td><s:property value="itemName" /></td>
					<td><s:property value="itemPrice" /><span>円</span></td>
					<td><s:property value="itemStock" /><span>個</span></td>
					<td><a href='<s:url action="BuyAction"><s:param name="id" value="id" ></s:param></s:url>'>購入はこちら</a></td>
					<td><select name="count">
						<option value="a" selected="selected">選択してください</option>
							<script type="text/javascript" language="javascript">
							for(var i=0;i<=<s:property value="itemStock" /> ;i++){
							document.write("<option value=" + i + ">");
							document.write(i);
							document.write("</option>");
							}
					</script>
					</select>
					</td>
				</tr>
			</s:iterator>
	</table>
	<s:form action="BuyItemAction">
		<s:property value="session.buyItem_name"/><br>
		<s:property value="session.buyItem_price"/><br>
		<s:property value="session.buyItem_stock"/><br>
<!--
		<select name="count">
							<option value="1" selected="selected">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
		</select>
 -->

			<select name="count">
				<option value="a" selected="selected">選択してください</option>
					<script type="text/javascript" language="javascript">
					for(var i=0;i<=<s:property value="session.buyItem_stock"/>;i++){
					document.write("<option value=" + i + ">");
					document.write(i);
					document.write("</option>");
					}
					</script>
			</select>
			<input type="radio" name="pay" value="1" checked="checked"/>現金
			<input type="radio" name="pay" value="2"/>クレジット
		<s:submit value="CONFIRME"/>
	</s:form>
	<a href='<s:url action="MyPageAction"/>'>MyPAGE</a>
</body>
</html>