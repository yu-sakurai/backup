<%@ page language="java" contentType="text/html; charasetUTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WELCOME</title>
</head>
<body>
名前とパスワードを入力してください。
<form method="post" action="WelcomeServlet">
	<input type="text" name="WelcomeServlet">
	<input type="password" name="password">
	<input type="submit" value="送信">

</form>

</body>
</html>