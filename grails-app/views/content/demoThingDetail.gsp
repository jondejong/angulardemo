<head>
    <meta name="layout" content="${layout}"/>
</head>

<body>
<div>
    <form ng-submit="saveThing()">
        <div><input type="hidden" ng-model="thing.id"></div>
        <div>Name: <input ng-model="thing.name"></div>
        <div>Description: <input ng-model="thing.description"></div>
        <div><input type="submit" value="save"/></div>
    </form>
</div>
</body>