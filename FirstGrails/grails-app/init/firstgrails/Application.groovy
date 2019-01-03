package firstgrails

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        println("shubham welcome")

        //Student s1=new Student("shubham",23,"cse")
        GrailsApp.run(Application, args)
    }
}