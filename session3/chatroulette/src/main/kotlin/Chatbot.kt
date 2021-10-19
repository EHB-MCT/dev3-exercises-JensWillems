class Chatbot(override val name: String): Person(name){
    override fun talk(){
        println(
            "IDK what to type"
        )
    }

}