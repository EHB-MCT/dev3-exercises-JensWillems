fun main(){
    println(
        "Enter number"
    )
    val number = readLine()!!
    println(
        "Enter language"
    )
    val language = readLine()!!

    val duolingo = Duolingo("${number}","${language}")

    duolingo.play()
}