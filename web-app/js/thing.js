var app = angular.module('demothing', ['ui']);

app.config(['$routeProvider', function($routeProvider) {
        $routeProvider.
            when('/thinglist', {templateUrl: '/angulardemo/content/demoThingList',   controller: ThingListCtrl}).
            when('/thing/:thingId', {templateUrl: '/angulardemo/content/demoThingDetail', controller: ThingDetailCtrl}).
            otherwise({redirectTo: '/thinglist'});
    }]);

function ThingListCtrl($scope, $http) {
    $http.get('/angulardemo/demothing/').success(function(data) {
        $scope.things = data;
    });

    $scope.sort = 'id';
}

function ThingDetailCtrl($scope, $http, $routeParams, $location) {
    $http.get('/angulardemo/demothing/' + $routeParams.thingId).success(function(data) {
        $scope.thing = data;
    });

    $scope.saveThing = function() {
        $http.post('/angulardemo/demothing/', angular.toJson($scope.thing)).success(function(data){
            $location.path("/thinglist");
        });
    }
}



