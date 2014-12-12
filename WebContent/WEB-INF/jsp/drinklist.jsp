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
 
<h2>Select your drink:</h2>
<table border="1" style="color: white">
	<tr>
		<th>Number</th>
		<th>Drink</th>
		<th>Price</th>
		<th>Availability</th>
	</tr>
	<c:forEach items="${drinks.drinks}" var="drink">
		<tr>
			<td align="center">
			<c:if test="${drink.inStock == 'true' }">
				<a href="barista/${drink.number}" style="color: white">${drink.number}</a>
			</c:if>
			<c:if test="${drink.inStock == 'false' }">
				${drink.number}
			</c:if>
            </td>
			<td>${drink.displayName}</td>
			<td>${drink.cost}</td>
			<td>${drink.inStock}</td>
		</tr>
	</c:forEach>
</table>
 
</div>
</center>
</body>
</html>