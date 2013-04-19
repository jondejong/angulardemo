<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta name="layout" content="angular"/>

    <r:require module="olson" />

    <r:script>
    scaffoldingModule.config([
        '$routeProvider',
        function($routeProvider) {
            var baseUrl = ${createLink(uri: "/partial")};
            $routeProvider.
        <g:each in="${controllerNames}" var="name">
            when('${name}/create', {templateUrl: baseUrl + '/${name}/campaign/create.html', controller: CreateCtrl}).
                    when('${name}/edit/:id', {templateUrl: baseUrl + '/${name}/campaign/edit.html', controller: EditCtrl}).
                    when('${name}/list', {templateUrl: baseUrl + '/${name}/campaign/list.html', controller: ListCtrl}).
                    when('${name}/show/:id', {templateUrl: baseUrl + '/${name}/campaign/show', controller: ShowCtrl}).
        </g:each>
        otherwise({redirectTo: '/program/list'});
}
]);

    </r:script>

</head>

<body ng-app="olson">


<div ng-view>Hello From Inside The View</div>
Hellow From Outside The View
</body>
</html>