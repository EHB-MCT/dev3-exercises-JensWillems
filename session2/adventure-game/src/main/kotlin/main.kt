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
            challengeThree()
        } else if(playerAnswer2.contains("low")){
            gameOver()
        }
    } else if( randomNumber <= 4){
        if (playerAnswer2.contains("low")){
            println(
                "wow, U know what u are doing!"
            )
            winner()
            challengeThree()
        } else if(playerAnswer2.contains("high")){
            gameOver()
        }
    }
}

fun challengeThree(){
    println(
        "U have to drive off road"
    )
    println(
        "Choose what car is the best for this"
    )
    val chosenCars = arrayOf("VW" , "BMW" , "Ford")
    println(
        chosenCars
    )
    print(
        "choose wisely"
    )
    val playerChosenCar = readLine().toString()

    if (playerChosenCar.contains("VW")){
        println(
            "U are afraid to drive, U fail this part!"
        )
        challengeTwo()
    } else if (playerChosenCar.contains("BMW")){
        println(
            "your car got stuck!"
        )
        gameOver()
    } else {
        println(
            "u chose wisely"
        )
        winner()
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