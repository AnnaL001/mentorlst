package question_2

class ReverseWords {
    /**
     * Reverse single word
     */
    private fun reverseWordsInSentence(word: String): String{
        // Check for empty spaces
        if(word == " ") return " ";

        val stringBuilder = StringBuilder();
        val chars = word.toCharArray();

        var startIndex = 0;
        var endIndex = chars.size - 1

        while (startIndex < endIndex){
            val letter = chars[startIndex]
            chars[startIndex] = chars[endIndex]
            chars[endIndex] = letter

            startIndex++
            endIndex--
        }

        return stringBuilder.append(chars).toString();
    }

    /**
     * Reverse words in a sentence
     */
    fun reverseSentenceWords(sentence: String): String {
        // Remove leading/trailing whitespace and transform to list
        val words = sentence.trim().split(" ");
        val transformed = StringBuilder();

        words.forEachIndexed { index, word ->
            val reversed = reverseWordsInSentence(word)
            transformed.append(reversed)

            if (index != words.size - 1){
                transformed.append(" ")
            }
        }

        return transformed.toString()
    }
}