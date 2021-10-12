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
    } else {
        println(
            "U failed your exam!"
        )
    }
}