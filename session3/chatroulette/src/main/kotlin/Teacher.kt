class Teacher (override val name: String): Person(name){
    override fun talk(){
        funFact()
    }
    fun funFact() {
        println("Fun fact!")
        println("All of you will fail this course")
    }
}