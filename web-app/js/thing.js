var demo = angular.module('demo', ['ui']);

demo.config(['$routeProvider', function($routeProvider) {
        $routeProvider.
            when('/thinglist', {templateUrl: '/angulardemo/content/demothing/list',   controller: ThingListCtrl}).
            when('/thing/:thingId', {templateUrl: '/angulardemo/content/demothing/edit', controller: ThingDetailCtrl}).
            when('/create', {templateUrl: '/angulardemo/content/demothing/edit', controller: NewThingCtrl}).
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

function NewThingCtrl($scope, $http, $location) {
    $http.get('/angulardemo/create/').success(function(data) {
        $scope.thing = data;
    });

    $scope.saveThing = function() {
        console.log("Date of thing: ");
        console.log($scope.thing.dateOfThing);
        $http.post('/angulardemo/demothing/', angular.toJson($scope.thing)).success(function(data){
            $location.path("/thinglist");
        });
    }
}

//myApp.controller('GreetingCtrl', ['$scope', function($scope) { $scope.greeting = 'Hola!'; }]);



