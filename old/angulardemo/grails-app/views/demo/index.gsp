<html>
<head>
    <meta name="layout" content="application"/>
    <r:require module="thing"/>
</head>

<div ng-app="demo">
    <div ng-view></div>
    <div ui-jq='dialog'>Loading outside...</div>


</div>

<div ng-app="demothing">
    <div ng-view></div>
    %{--<div ui-jq='dialog' ng-controller='NewThingCtrl'>--}%
        %{--<div id='dialog-content'>Loading inside...<button onclick="$('#dialog-content').load('/angulardemo/content/demoThingDetail');">Load</button>--}%
        %{--</div>--}%
    </div>
</div>



</body>
</html>