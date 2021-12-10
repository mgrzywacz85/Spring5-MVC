<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>


<html>

<head>

<title>Student Registration Form</title>

</head>


<body>

	<form:form action="processForm" modelAttribute="student">
	
	
	First name: <form:input path="firstName"/>
	
	<br>
	
	Last name: <form:input path="lastName"/>
	
	<br>
	
	<form:select path="country">
	
	<form:option value="Poland" label="Poland" />
	<form:option value="France" label="France" />
	<form:option value="England" label="England" />
	<form:option value="India" label="India" />
	
		
	</form:select>
	
	<br>
	
	<input type="submit" value="Submit"/>
	
	
	</form:form>


</body>





</html>