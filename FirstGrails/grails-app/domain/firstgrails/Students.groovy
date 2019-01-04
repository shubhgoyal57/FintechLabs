package firstgrails

class Students {

    String name
    Integer age
    String course
    Address address

    static constraints = {
        address(blank: false, nullable: false)
        name(blank: false, size: 4..20)
        age(nullable: false)
        course(blank: false, size: 2..7)
    }
}
