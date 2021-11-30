class Duolingo() {

    val words = mutableListOf<Word>(Word("World","Wereld","Engels"),
        Word("Hello","Hallo","Engels"),
        Word("Bye","daag","Engels"),
        Word("Sun","Zon","Engels"),
        Word("Moon","Maan","Engels"),
        Word("Shovel","Shop","Engels"),
        Word("Chicken","Kip","Engels"),
        Word("Enfant","Kind","Frans"),
        Word("Ecole","Ecole","Frans"),
        Word("Voiture","Auto","Frans"),
        Word("Carrefour","Kruispunt","Frans"),
        Word("Chien","Hond","Frans"))

    fun play(){
        val randomWords = words.random()
        println(
            "${randomWords.original}"
        )
    }

}