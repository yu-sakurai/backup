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
	<s:form action="BuyConfirmAction">
	<table>
	<tr>
					<td><s:property value="#session.item_name" /></td>
					<td><s:property value="#session.item_price" /><span>円</span></td>
					<td><s:property value="#session.item_stock" /><span>個</span></td>

					<%-- <td><a href='<s:url action="BuyAction"/>'>購入はこちら</a></td> --%>
					<td><select name="item_count">
						<option value="a" selected="selected">選択してください</option>
							<script type="text/javascript" language="javascript">
							for(var i=0;i<=<s:property value="#session.item_stock" /> ;i++){
							document.write("<option value=" + i + ">");
							document.write(i);
							document.write("</option>");
							}
					</script>
					</select>
					</td>
	</tr>
	</table>
	<s:submit value="COMP"/>
	</s:form>


</body>
</html>