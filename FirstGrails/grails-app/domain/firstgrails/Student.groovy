package firstgrails

class Student {



    String name
    Integer age
    String course



    static constraints = {

        name(blank: false,size: 4..20)
        age(nullable : false)
        course(blank: false,size: 2..7)
    }
}
