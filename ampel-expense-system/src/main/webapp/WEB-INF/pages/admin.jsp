<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>
			Welcome Admin: ${pageContext.request.userPrincipal.name} | <a
				href="javascript:formSubmit()"> Logout</a>
		</h2>
	</c:if>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>
	
	<table>
	<tr><td>First Name: </td> <td> <input type="text" name="firstName" > </td></tr>
	<tr><td>Last Name: </td> <td> <input type="text" name="lastName" > </td></tr>
	<tr><td>email: </td> <td> <input type="text" name="email" > </td></tr>
	<tr><td>  Username : </td> <td> <input type="text" name="username" > </td></tr>
	<tr><td>  Password : </td> <td> <input type="text" name="password" > </td></tr>
	<tr><td>  Role : </td> <td> 
			<select name="role">
					<option value="0">--Select--</option>
					<c:forEach items="${roles}" var="role">
						<option value="id">${roleDescription}</option>
					</c:forEach>
			</select>
			</td></tr>
	</table>
	

</body>
</html>