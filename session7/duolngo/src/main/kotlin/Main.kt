import java.lang.Exception

fun main(){
    println(
        "Enter number"
    )
    val number = readLine()!!
    println(
        "Enter language"
    )
    val language = readLine()!!
    println(
        "Enter difficulty between easy or difficult"

    )
    val difficulty = readLine()!!

    if ( difficulty == "easy"){

    } else if( difficulty == "difficult")
    else{
        throw Exception("Please enter a difficulty between easy or difficult")
    }

    val duolingo = Duolingo("${number}","${language}" )
    duolingo.play()



}