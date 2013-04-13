function ThingListCtrl($scope, $http) {
    $http.get('/angulardemo/demoThing').success(function(data) {
        $scope.things = data;
    });

    $scope.sort = 'id';
}