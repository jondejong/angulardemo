modules = {
    application {
//        resource url:'js/application.js'
        resource url:'css/application.css'
        resource url:'css/angular-ui.css'
        resource url:'js/angular-ui.js'

    }

    thing {
        dependsOn 'application'
        resource url:'js/thing.js'
    }
}