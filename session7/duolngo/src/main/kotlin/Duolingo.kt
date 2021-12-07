class Duolingo(
    val number : String,
    val language: String
) {

    var words = mutableListOf<Word>(
        EnglishWord("World","Wereld",1),
        EnglishWord("Hello","Hallo",1),
        EnglishWord("Bye","Daag",1),
        EnglishWord("Sun","Zon",1),
        EnglishWord("Moon","Maan",1),
        EnglishWord("Shovel","Shop",1),
        EnglishWord("Chicken","Kip",1),
        FrenchWord("Enfant","Kind",1),
        FrenchWord("Ecole","School",1),
        FrenchWord("Voiture","Auto",1),
        FrenchWord("Carrefour","Kruispunt",1),
        FrenchWord("Chien","Hond",1))

    fun play(){

    val list = words.filter {
             it.language == language }

        val currentWords = list.shuffled().take(number.toInt()).toMutableSet()

        while (currentWords.count() > 0){
            val selectedWord = currentWords.random()
            println(
                "Translate this word: "+
                selectedWord.original
            )
            val PlayerAnswer = readLine()
            if(selectedWord.translated.contains(PlayerAnswer.toString())){
                println(
                    "Goodjob!"
                )
                currentWords.remove(selectedWord)
            } else {
                selectedWord.difficulty++
                println(
               "Wrong! The answer was " + selectedWord.translated
                )
            }
            println(currentWords.count())
        }


    }

}