grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        compile( 'org.springframework.webflow:spring-webflow:2.0.8.RELEASE',
                'org.springframework.webflow:spring-binding:2.0.8.RELEASE',
                'org.springframework.webflow:spring-js:2.0.8.RELEASE' ) {
            exclude group: "org.springframework", name: "spring-beans"
            exclude group: "org.springframework", name: "spring-context"
            exclude group: "org.springframework", name: "spring-core"
            exclude group: "org.springframework", name: "spring-web"
            exclude group: "org.springframework", name: "spring-webmvc"
            exclude group: "commons-logging", name: "commons-logging"
            transitive = false
        }

        runtime 'ognl:ognl:2.7.3'

        compile( 'dom4j:dom4j:1.6.1' ) {
            excludes 'jaxen', 'jaxme-api', 'junitperf', 'pull-parser', 'relaxngDatatype',
                    'stax-api', 'stax-ri', 'xalan', 'xercesImpl', 'xml-apis', 'xpp3', 'xsdlib'
        }
    }

    plugins {
        build( ":release:2.2.1", ':rest-client-builder:1.0.3' ) {
            export = false
        }
    }
}
