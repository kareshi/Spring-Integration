<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>CRM &gt; Create Lead</title>
</head>
<body>

<h1>CRM &gt; Create Lead</h1>

<c:if test="${not empty param.created}">
	<p><b>You have successfully created a lead.</b></p>
</c:if>

<form:form modelAttribute="lead">
	<table>
		<tr>
			<td>First name:</td>
			<td><form:input path="firstName" /></td>
		</tr>
		<tr>
			<td>Middle initial:</td>
			<td><form:input path="middleInitial" size="1" /></td>
		</tr>
		<tr>
			<td>Last name:</td>
			<td><form:input path="lastName" /></td>
		</tr>
		<tr>
			<td>Country:</td>
			<td>
				<form:select path="country">
					<form:options items="${countryList}" itemValue="code" itemLabel="name" />
				</form:select>
			</td>
		</tr>
		<tr>
			<td>Address 1:</td>
			<td><form:input path="address1" /></td>
		</tr>
		<tr>
			<td>Address 2:</td>
			<td><form:input path="address2" /></td>
		</tr>
		<tr>
			<td>City:</td>
			<td><form:input path="city" /></td>
		</tr>
		<tr>
			<td>State or province:</td>
			<td><form:input path="stateOrProvince" /></td>
		</tr>
		<tr>
			<td>Postal (or ZIP) code:</td>
			<td><form:input path="postalCode" /></td>
		</tr>
		<tr>
			<td>Home phone:</td>
			<td><form:input path="homePhone" /></td>
		</tr>
		<tr>
			<td>Work phone:</td>
			<td><form:input path="workPhone" /></td>
		</tr>
		<tr>
			<td>Mobile phone:</td>
			<td><form:input path="mobilePhone" /></td>
		</tr>
		<tr>
			<td>E-mail:</td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Submit"></input></td>
		</tr>
	</table>
</form:form>

</body>
</html>
