fun main() {
    //player
    println("Type your answer: ")
    val playerInput = readLine()
    println("your choise: " +playerInput)

    //Computer
    val optionsGame = arrayOf("rock" , "paper" , "scissors")
    val randomNumber = (0..2).random()
    val computerChoise = optionsGame[randomNumber]
    println("computers choise: " + computerChoise)

    //Winner-loser
    if(computerChoise == playerInput){
        println("draw!")
    }

}