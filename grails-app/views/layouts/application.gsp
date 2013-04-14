<%@ page contentType="text/html;charset=UTF-8" %>
<html ng-app="demothing">
<head>

    <title>Angular Demo</title>

    <link href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" type="text/css" rel="stylesheet"
          media="screen, projection"/>


    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.6/angular.min.js"></script>

    <r:require module="application"/>
    <g:layoutHead/>
    <r:layoutResources/>
</head>

<body>
<div class="header">
    <div class="header-link">
        <a href="#/">Home</a>
    </div>

    <div class="header-link">
        <a href="#">Add Thing</a>
    </div>
</div>

<div class="content">
    <g:layoutBody/>
</div>

%{--<div id="dialog-container" ui-jg="dialog" ui-option="{autoOpen: true}">Loading...</div>--}%
<r:script>
//    $("#dialog-container").dialog({ autoOpen: false });


</r:script>
<r:layoutResources/>
</body>
</html>