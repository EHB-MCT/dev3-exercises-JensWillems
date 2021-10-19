open class Person(open val name: String) {
    fun introduction() {
        println(
            "Hello,I'm how ${name} are you?"
        )
    }
    open fun talk(){

    }
}