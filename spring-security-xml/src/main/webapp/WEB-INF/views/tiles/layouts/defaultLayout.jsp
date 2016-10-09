<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
 <sec:authorize access="authenticated" var="authenticated"/>
<head>
    <title>Spring Security Xml Demo</title>
    <meta name="viewport" content="width=device-with, initial-scale=1.0"/>
    <link href="/spring-security-xml/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="/spring-security-xml/static/css/styles.css" rel="stylesheet">
</head>

<body>
    <tiles:insertAttribute name="header"/>
    <tiles:insertAttribute name="body"/>
    <tiles:insertAttribute name="footer"/>

    <script src="/spring-security-xml/static/js/jquery-1.11.0.min.js"></script>
    <script src="/spring-security-xml/static/js/bootstrap.min.js"></script>
   
				<script>
				$(document).ready(function(){

					$("#logout").click(function(e){
						e.preventDefault();
						$("#logout-form").submit();
					});
				});
				
				</script>
</body>

</html>