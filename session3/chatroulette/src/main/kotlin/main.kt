fun main(){
    //val Jack = Student("Jack")
    //val Bert = Comedian("Bert")

    //val persons = arrayOf(Jack, Bert)
    println(
        "Starting ChatRoulette"
    )
    val chatPartners = arrayOf(Student("Bert"), Teacher("Jack"), Comedian("Ken"),Chatbot("Timmy"))

    val chatPartner = chatPartners.random()
    chatPartner.introduction()
    chatPartner.talk()


}