<head>
    <meta name="layout" content="${layout}" />
</head>
<div>
    <div>
        %{--Date: <input name="dateField" ng-model="date" ui-date>--}%
        Search: <input ng-model="query"/>
        Order By: <select ng-model="sort">
            <option value="id">ID</option>
            <option value="name">Name</option>
            <option value="description">Description</option>
        </select>
    </div>
    <div>
        <table>
            <thead>
                <tr>
                    <td>ID</td>
                    <td>Name</td>
                    <td>Description</td>
                    <td></td>
                </tr>
            </thead>
            <tbody>
                <tr ng-repeat="thing in things | filter:query | orderBy:sort">
                    <td>{{thing.id}}</td>
                    <td>{{thing.name}}</td>
                    <td>{{thing.description}}</td>
                    <td><a title="Edit {{thing.name}}" ui-jq="tooltip" href="#/thing/{{thing.id}}">Edit</a></td>
                </tr>
            </tbody>
        </table>
    </div>
</div>
