<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.example.bean.Shopping" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output</title>
</head>
<body>
<table>
<tbody>
<tr>
<th>Id</th>
<th>Code</th>
<th>Name</th>
<th>Description</th>
<th>Price</th>
<th>Production Code</th>
<th>Available Quantity</th>
</tr>
<c:forEach items="${list}" var="li">
<tr>
<td align="center"><c:out value="${li.id}" /></td>
<td align="center"><c:out value="${li.code}" /></td>
<td align="center"><c:out value="${li.name}" ></c:out></td>
<td align="center"><c:out value="${li.description}" ></c:out></td>
<td align="center"><c:out value="${li.price}" ></c:out></td>
<td align="center"><c:out value="${li.productionCode}" ></c:out></td>
<td align="center"><c:out value="${li.availabelQuantity}" ></c:out></td>
</tr>
</c:forEach>

</tbody>
</table>

</body>
</html>