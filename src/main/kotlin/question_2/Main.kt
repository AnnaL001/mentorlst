package question_2

import getStringsFromFile

fun main(){
    // Initialize class
    val reverse = ReverseWords()

    // Get input & output
    val inputs = getStringsFromFile("src/main/kotlin/inputs/question_2_input.txt")
    val  outputs = getStringsFromFile("src/main/kotlin/outputs/question_2_output.txt")


    // Reverse words in input sentence
    inputs.drop(1).forEachIndexed { index, sentence ->
        val actual = reverse.reverseSentenceWords(sentence)
        println(actual)

        // Add tests
        val output = outputs[index]
        if(actual.replace("\\s+".toRegex(), "") != output.replace("\\s+".toRegex(), "")){
            println("FAILED")
            println("EXPECTED: $output")
            // Stop execution if failed tests
            return@forEachIndexed
        }
    }
}