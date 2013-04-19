var demo = angular.module('demo', ['ui']);

var app = angular.module('demothing', ['ui']);

app.config(['$routeProvider', function($routeProvider) {
        $routeProvider.
            when('/thinglist', {templateUrl: '/angulardemo/content/demoThingList',   controller: ThingListCtrl}).
            when('/thing/:thingId', {templateUrl: '/angulardemo/content/demoThingDetail', controller: ThingDetailCtrl}).
            when('/create', {templateUrl: '/angulardemo/content/demoThingDetail', controller: NewThingCtrl}).
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
        alert("bazinga!");
        $http.post('/angulardemo/demothing/', angular.toJson($scope.thing)).success(function(data){
            $location.path("/thinglist");
        });
    }
}

myApp.controller('GreetingCtrl', ['$scope', function($scope) { $scope.greeting = 'Hola!'; }]);



