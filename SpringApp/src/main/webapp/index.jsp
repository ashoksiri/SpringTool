<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<spring:url value="/static/core/css/main.css" var="coreCss" />
<spring:url value="/static/core/css/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/static/core/js/jquery-3.1.1.min.js" var="jQuery" />
<spring:url value="/static/core/js/bootstrap.min.js" var="bootstrapJs" />
<link href="${coreCss}" rel="stylesheet" />
<link href="${bootstrapCss}" rel="stylesheet" />
<script type="text/javascript" src="${jQuery}"></script>
<script type="text/javascript" src="${bootstrapJs}"></script>

</head>
<body>
<div class="jumbotron text-center">
  <h1>Welcome to My Application</h1>
  <p></p>
  <p><button onclick="location.href='login'">click to Login</button></p>
</div>
</body>
</html>