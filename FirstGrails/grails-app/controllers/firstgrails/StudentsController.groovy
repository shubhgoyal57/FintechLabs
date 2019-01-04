package firstgrails

class StudentsController {

    def index() {



        Students s1=new Students()
        s1.name="shuhbam"
        s1.age=23
        s1.course="cse"

        s1.save(flush:true)
        Address adress=new Address()
        adress.address="sirsa"
        adress.zip=125055
        adress.save(flush: true)

    }


}
