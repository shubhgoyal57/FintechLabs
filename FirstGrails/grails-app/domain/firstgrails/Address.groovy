package firstgrails

class Address {

    String address
    Integer zip
    static belongsTo = [student : Students]
    static constraints = {
        address(blank: false)
        zip(nullable: false)
    }
}
