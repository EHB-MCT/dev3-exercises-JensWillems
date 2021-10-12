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
        winner()
        println(
            "U have scored one point on your exam"
        )
        println(
            "But that is not enough!"
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
    val playerAnswer2 = readLine().toString()
    val randomNumber = (1..6).random()
    println(
        randomNumber
    )
    if(randomNumber >= 4){
        if (playerAnswer2.contains("high")){
            winner()
            println(
                "wow, U know what u are doing!"
            )
        } else if(playerAnswer2.contains("low")){
            gameOver()
        }
    } else if( randomNumber <= 4){
        if (playerAnswer2.contains("low")){
            println(
                "wow, U know what u are doing!"
            )
            winner()
        } else if(playerAnswer2.contains("high")){
            gameOver()
        }
    }


}
fun winner(){
println(
    "Correct, U did it!"
)
    println(
        "An extra Point"
    )
}

fun gameOver(){
    println(
        "U failed your exam!"
    )
}