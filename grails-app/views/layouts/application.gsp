<%@ page contentType="text/html;charset=UTF-8" %>
<html ng-app>
<head>

    <title>Angular Demo</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.6/angular.min.js"></script>
    <r:require module="application"/>
    <g:layoutHead/>
    <r:layoutResources/>
</head>

<body>
<div class="header">
    <a class="header-link" href="<g:createLink controller="demothing" action="index"/>">Home</a>
    <a class="header-link dialog-link" href="#">Add Thing</a>
</div>

<div class="content">
    <g:layoutBody/>
</div>
<r:layoutResources/>
</body>
</html>