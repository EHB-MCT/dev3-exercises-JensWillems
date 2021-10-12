fun main(){
    println(
    "U are doing your theory exam for driven"
    )
    println(
        "Answer these questions to pass!"
    )
    challengeOne()
}

fun challengeOne(){
    println(
    "Your first question!, How many wheels does a car have?"
    )
    val riddleAnswer = arrayOf("4" , "four" , "vier")
    println("Type your answer: ")
    val playerAnswer = readLine()
    if(riddleAnswer.contains(playerAnswer)){
        println(
            "CORRECT!"
        )
        challengeTwo()
    } else {
       gameOver()
    }
}
fun challengeTwo(){
    println(
        "For your second question you have to guess between low or high"
    )
    val playerAnswer2 = readLine()?.toInt()
    val randomNumber = (1..6).random()
   if (randomNumber == playerAnswer2){

   }
}


fun gameOver(){
    println(
        "U failed your exam!"
    )
}