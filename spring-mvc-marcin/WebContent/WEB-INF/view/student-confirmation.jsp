<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>

<title>Student Confirmation</title>

</head>

<body>

	The student is confirmed: ${student.firstName} ${student.lastName}


	<br>
	<br> Country ISO: ${student.selectedCountryKey }


	<br>
	<br> Country: ${student.selectedCountryValue}


	<br>
	<br> Favorite language: ${student.favoriteLanguage}

	<br>
	<br> Operating Systems:
	
	<ul>
		
		<c:forEach var="temp" items="${student.operatingSystems}">
		
		<li> ${temp} </li>
		
		</c:forEach>
		
	</ul>


</body>




</html>