modules = {
    application {
        resource url:'js/application.js'
    }

    'angular-scaffolding-olson' {
        dependsOn 'angular-resource'
        resource id: 'js', url: [plugin: 'angular-scaffolding', dir: 'js/angular', file: "angular-ui.js"], nominify: true
        resource url: 'js/olson-scaffolding.js'
        resource id: 'css', url: [plugin: 'angular-scaffolding', dir: 'css', file: 'angular-ui.css']
        resource id: 'css', url: [plugin: 'angular-scaffolding', dir: 'css', file: 'scaffolding.css']
    }


    'angular-grails-olson' {
        dependsOn 'angular-scaffolding-olson'
        resource id: 'js', url: [plugin: 'angular-scaffolding', dir: 'js', file: 'grails-default.js']

    }

    olson {
        dependsOn('angular-grails-olson')
        resource url:'js/olson.js'
    }
}