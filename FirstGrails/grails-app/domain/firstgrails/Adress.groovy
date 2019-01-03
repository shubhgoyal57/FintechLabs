package firstgrails

class Adress {

    String address
    Integer zip

    static constraints = {
        address(blank: false)
        zip(nullable: false)
    }
}
