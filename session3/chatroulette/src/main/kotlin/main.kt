fun main(){
    //val Jack = Student("Jack")
    //val Bert = Comedian("Bert")

    //val persons = arrayOf(Jack, Bert)

    val chatPartners = arrayOf(Student("Bert"), Teacher("Jack"), Comedian("Ken"))

    val chatPartner = chatPartners.random()
    chatPartner.introduction()
    chatPartner.talk()


}