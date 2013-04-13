<%@ page contentType="text/html;charset=UTF-8" %>
<html ng-app>
<head>

    <title>Angular Demo</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.6/angular.min.js"></script>
    <script src="/angulardemo/static/bundle-bundle_application_defer.js" type="text/javascript" ></script>
    %{--<r:require module="application"/>--}%
    <g:layoutHead/>
    <r:layoutResources/>
</head>

<body>
<div class="header">
    <div class="header-link">
        <a href="<g:createLink controller="demothing" action="index"/>">Home</a>
    </div>
    <div class="header-link">
        <a href="#">Add Thing</a>
    </div>
</div>

<div class="content">
    <g:layoutBody/>
</div>
<r:layoutResources/>
</body>
</html>