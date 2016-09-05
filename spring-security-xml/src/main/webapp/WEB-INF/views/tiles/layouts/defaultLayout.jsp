<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>

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
</body>

</html>