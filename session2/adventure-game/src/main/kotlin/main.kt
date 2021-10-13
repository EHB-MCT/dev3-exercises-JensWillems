fun main(){
    println(
        "Welcome PARTICIPANT!!"
    )
    println(
    "U have been chosen to play our game..."
    )
    println(
        "Squad game!"
    )
    println(
        "Complete each challenge to win a LOT of money!"
    )
    challengeOne()
}

fun challengeOne(){
    println(
    "Your first challenge, what rectangle shape has four equal sides?"
    )
    val riddleAnswer = arrayOf("square" , "vierkant" , "ruit", "Square")
    println("Type your answer: ")
    val playerAnswer = readLine()
    if(riddleAnswer.contains(playerAnswer)){
        println(
            "U passed your first challenge!"
        )
        println(
            "But there are MORE!"
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
    println(
        "It is a game of luck!"
    )
    println("Type your answer: ")
    val playerAnswer2 = readLine().toString()
    val randomNumber = (1..6).random()
    println(
        randomNumber
    )
    if(randomNumber >= 4){
        if (playerAnswer2.contains("high")){
            winner()
            println(
                "wow, U got lucky!"
            )
            challengeThree()
        } else if(playerAnswer2.contains("low")){
            gameOver()
        }
    } else if( randomNumber <= 4){
        if (playerAnswer2.contains("low")){
            println(
                "wow, U got lucky!"
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
        "For the third challenge, u have to chose between 3 forms"
    )
    println(
        "Choose your form"
    )
    val chosenForms = arrayOf("Umbrella" , "Circle" , "Triangle")
    println(
        "Umbrella , Circle , Triangle"
    )
    print(
        "choose wisely"
    )
    println("Type your answer: ")
    val playerChosenCar = readLine().toString()
println(
    "U have to carve the form out of a cookie!!!"
)
    if (playerChosenCar.contains("Circle")){
        println(
            "U are afraid to do it!"
        )
        challengeTwo()
    } else if (playerChosenCar.contains("Umbrella")){
        println(
            "you broke the umbrella"
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
        "U failed the game"
    )
    println(
        "so no money for you..."
    )
    println(
        "U DIED!"
    )
}