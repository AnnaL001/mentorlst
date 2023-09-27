import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader
import java.lang.Exception

/**
 * Read strings from file
 * @param filePath Path to file
 * @return An array list of strings
 */
fun getStringsFromFile(filePath: String): ArrayList<String> {
    val outputFile = File(filePath)
    val outputStream = FileInputStream(outputFile)
    val reader = BufferedReader(InputStreamReader(outputStream))

    val outputList = ArrayList<String>()

    var line: String? = reader.readLine()

    try {
        while (line != null){
            outputList.add(line)
            line = reader.readLine()
        }
    } catch (e: Exception){
        println("Error occurred while reading file: ${e.message}")
    } finally {
        reader.close()
    }

    return outputList
}

/**
 * Read ints from file
 * @warning File must only contain numbers
 * @param filePath Path to file
 * @return An array list of integers
 */
fun getIntsFromFile(filePath: String): ArrayList<Int> {
    val inputFile = File(filePath)
    val inputStream = FileInputStream(inputFile)
    val reader = BufferedReader(InputStreamReader(inputStream))

    val inputList = ArrayList<Int>()

    var line: String? = reader.readLine()

    try {
        while (line != null){
            try {
                val number = line.toInt()
                inputList.add(number)
            } catch (e: NumberFormatException){
                println("Invalid integer conversion: $e")
            }
            line = reader.readLine()
        }
    } catch (e: Exception){
        println("Error occurred while reading file: ${e.message}")
    } finally {
        reader.close()
    }

    return inputList
}

