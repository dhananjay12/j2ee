<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="resources/css/style.css" type="text/css"/>
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
	
	<form:errors path="*" cssClass="errorblock" element="div"/>
<table>
<tr>
<td><form:label path="fname"><spring:message code="label.fname"/></form:label></td>
<td><form:input path="fname" /><form:errors path="fname" cssClass="error" /></td>
</tr>
<tr>
<td><form:label path="lname"><spring:message code="label.lname"/></form:label></td>
<td><form:input path="lname" /><form:errors path="lname" cssClass="error" /></td>
</tr>
<tr>
<td><form:label path="email"><spring:message code="label.email"/></form:label></td>
<td><form:input path="email" /><form:errors path="email" cssClass="error" /></td>
</tr>
<tr>
<td><form:label path="phone"><spring:message code="label.phone"/></form:label></td>
<td><form:input path="phone" /><form:errors path="phone" cssClass="error" /></td>
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