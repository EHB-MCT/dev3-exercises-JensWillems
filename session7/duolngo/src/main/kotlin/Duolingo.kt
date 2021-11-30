class Duolingo() {

    val words = mutableListOf<Word>(Word("World","Wereld","Engels"),
        Word("Hello","Hallo","Engels"),
        Word("Bye","Daag","Engels"),
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
        val currentWords = words.shuffled().take(5).toMutableSet()

        while (currentWords.count() > 0){
            val selectedWord = currentWords.random()
            println(
                "Translate this word: "+
                selectedWord.original
            )
            val PlayerAnswer = readLine()
            if(selectedWord.translation.contains(PlayerAnswer.toString())){
                println(
                    "Goodjob!"
                )
                currentWords.remove(selectedWord)
            } else {
                println(
                    "Wrong!"
                )
            }
            println(currentWords.count())
        }

    }

}