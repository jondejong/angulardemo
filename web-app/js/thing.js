function ThingListCtrl($scope) {
    $scope.things = [
        {"name": "Something",
            "description": "This is a thing."},
        {"name": "Another thing",
            "description": "This is something else."},
        {"name": "Car",
            "description": "This thing is a car."},
        {"name": "Another car",
            "description": "This thing is another car."},
        {"name": "Car 3.0",
            "description": "Third revolution of the car."},
        {"name": "Awesome Thing™",
            "description": "Yet another sweet thing."}
    ];

    $scope.sort = 'name';
}