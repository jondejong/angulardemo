<head>
    <meta name="layout" content="${layout}" />
</head>
<div>
    <div>
        Search: <input ng-model="query"/>
        Order By: <select ng-model="sort">
            <option value="id">ID</option>
            <option value="name">Name</option>
            <option value="description">Description</option>
            <option value="dateOfThing">Date Of Thing</option>
        </select>
    </div>
    <div>
        <table>
            <thead>
                <tr>
                    <td>ID</td>
                    <td>Name</td>
                    <td>Description</td>
                    <td>Date Of Thing</td>
                    <td></td>
                </tr>
            </thead>
            <tbody>
                <tr ng-repeat="thing in things | filter:query | orderBy:sort">
                    <td>{{thing.id}}</td>
                    <td>{{thing.name}}</td>
                    <td>{{thing.description}}</td>
                    <td>{{thing.dateOfThing}}</td>
                    <td><a title="Edit {{thing.name}}" ui-jq="tooltip" href="#/thing/{{thing.id}}">Edit</a></td>
                    %{--<td><input ng-model='thing.name'/></td>--}%
                </tr>
            </tbody>
        </table>
    </div>
</div>
