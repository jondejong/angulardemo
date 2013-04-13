<html>
<head>
    <meta name="layout" content="application" />
    <r:require module="application" />
</head>
<body>
<div>
    Search: <input ng-model="query" />
    Order By: <select ng-model="sort">
        <option value="name">Name</option>
        <option value="description">Description</option>
    </select>
</div>
<div ng-controller="ThingListCtrl">
    <table>
        <thead>
            <tr>
                <td>Name</td>
                <td>Description</td>
                <td></td>
            </tr>
        </thead>
        <tbody>
            <tr ng-repeat="thing in things | filter:query | orderBy:sort">
                <td>{{thing.name}}</td>
                <td>{{thing.description}}</td>
                <td><a href="#">Edit</a></td>
            </tr>
        </tbody>
    </table>
</div>
</body>
</html>