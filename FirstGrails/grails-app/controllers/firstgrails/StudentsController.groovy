package firstgrails

class StudentsController {

    def index() {

        println("in controller")
        Student s1=new Student()
        s1.name="shuhbam"
        s1.age=23
        s1.course="shuhbam"
        s1.save(flush:true)
        render "${s1.name}"
    }
}