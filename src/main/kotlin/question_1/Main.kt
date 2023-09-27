package question_1

import getIntsFromFile
import getStringsFromFile


fun main() {
    val multiples = Multiples()
    val inputList = getIntsFromFile("src/main/kotlin/inputs/question_1_input.txt")
    val outputList = getStringsFromFile("src/main/kotlin/outputs/question_1_output.txt")

    inputList.drop(1).forEachIndexed { index, num ->
        val actual = multiples.multiplesOfThreeAndFive(num)
        println(actual)

        // Add tests
        val output = outputList[index]
        if(actual.replace("\\s+".toRegex(), "") != output.replace("\\s+".toRegex(), "")){
            println("FAILED")
            println("EXPECTED: $output")
            return@forEachIndexed
        }
    }



}