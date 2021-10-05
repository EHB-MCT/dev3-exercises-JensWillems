fun main() {
    val playerInput = readLine()
    println("your choise :" + playerInput)

    val optionsGame = arrayOf("rock" , "paper" , "scissors")
    val randomNumber = (0..2).random()
    println(optionsGame[randomNumber])

}