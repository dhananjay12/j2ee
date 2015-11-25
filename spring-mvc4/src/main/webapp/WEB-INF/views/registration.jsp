<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form:form method="post" action="register" commandName="registrationModel">
<h2>Registration</h2>
<a href="?language=en">
		English
	</a>
	<a href="?language=es">
		Spanish
	</a> 
<table>
<tr>
<td><form:label path="fname"><spring:message code="label.fname"/></form:label></td>
<td><form:input path="fname" /></td>
</tr>
<tr>
<td><form:label path="lname"><spring:message code="label.lname"/></form:label></td>
<td><form:input path="lname" /></td>
</tr>
<tr>
<td><form:label path="email"><spring:message code="label.email"/></form:label></td>
<td><form:input path="email" /></td>
</tr>
<tr>
<td><form:label path="phone"><spring:message code="label.phone"/></form:label></td>
<td><form:input path="phone" /></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="<spring:message code="label.register"/>"/>
</td>
</tr>
</table>
 
</form:form>
</body>
</html>