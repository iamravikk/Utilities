<html>
<body>
	<h2>Hello!</h2>
	<form action="${pageContext.request.contextPath}/hello" method="get">
		Enter your name : <input type="text" name="name"/>
		<input type="submit" value="Greet yourself!">
	</form>
</body>
</html>
