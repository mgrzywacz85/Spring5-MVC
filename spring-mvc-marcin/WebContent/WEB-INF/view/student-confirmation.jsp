<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>

<title>Student Confirmation</title>

</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<hr>
<br>

Country ISO: ${student.selectedCountryKey }

<hr>
<br>


Country: ${student.selectedCountryValue}

<hr>
</body>




</html>