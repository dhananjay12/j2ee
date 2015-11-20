<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>
    .error {
    	color: red;
    }
  </style> 
</head>
<body>
<form:form method="post" action="register" commandName="refistrationForm">
 	<h2><spring:message code="registration.heading"/></h2>
    <table>
    <tr>
        <td><form:label path="fname"><spring:message code="label.fname"/></form:label></td>
        <td><form:input path="fname" /><form:errors path="fname" cssClass="error"/></td> 
    </tr>
    <tr>
        <td><form:label path="lname"><spring:message code="label.lname"/></form:label></td>
        <td><form:input path="lname" /><form:errors path="lname" cssClass="error"/></td>
    </tr>
    <tr>
        <td><form:label path="email"><spring:message code="label.email"/></form:label></td>
        <td><form:input path="email" /><form:errors path="email" cssClass="error"/></td>
    </tr>
    <tr>
    	<td>
            <input type="submit" value="Cancel" formaction="cancelRegistration" formmethod="get"/>
        </td>
        <td>
            <input type="submit" value="Register"/>
        </td>
    </tr>
</table>  
     
</form:form>
</body>
</html>