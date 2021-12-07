open class Person(open val name: String) {
    fun introduction() {
        println(
            "Hello,I'm am ${name} how are you?"
        )
    }
    open fun talk(){

    }
}