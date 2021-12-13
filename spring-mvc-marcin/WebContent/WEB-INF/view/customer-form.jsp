<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>

	<title>Customer Registration Form</title>

	<style>
		.error {color: red}  //this is the style referenced below in form:errors under Last name
	</style>


</head>

<body>

	Fill out the form:
	
	<br><br>

	<form:form action="processForm" modelAttribute="customer">
	
	First name: <form:input path="firstName" />

		<br>
		<br>
	
	Last name (required): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />

		<br>
		<br>

		<input type="submit" value="Submit" />

	</form:form>




</body>


</html>