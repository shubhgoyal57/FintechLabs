package firstgrails

class AddressController {

    def index() {
        Adress adress =new Adress()
        adress.address="sirsa"
        adress.zip=125055
        adress.save(flush: true)
        render "${adress.address}"
    }
}
