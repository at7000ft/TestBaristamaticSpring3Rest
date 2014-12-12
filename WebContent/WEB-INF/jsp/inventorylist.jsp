<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Baristamatic</title>
</head>
<body style="background-color: #111111;">
<center>
<div style="color: white">
<h1>Welcome To Baristamatic</h1>

<br>
<h2>Current Inventory:</h2>
<table border="1" style="color: white">
	<tr>
		<th>Item</th>
		<th>Count</th>
	</tr>
	<c:forEach items="${inventory.items}" var="item">
		<tr>
			<td>${item.displayName}</td>
			<td>${item.count}</td>
		</tr>
	</c:forEach>
</table>

</div>
</center>
</body>
</html>