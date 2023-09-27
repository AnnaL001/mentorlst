package question_1

class Multiples {
    /**
     * Check for multiples of three and five
     * Assumption: Input provided is only of Integer type
     */
    fun multiplesOfThreeAndFive(num: Int): String {
        var found = false;
        val stringBuilder = StringBuilder();

        for (i in 1..num){
            if(i % 15 == 0){
                stringBuilder.append("Mentorlst ")
                found = true
            } else if(i % 5 == 0){
                stringBuilder.append("Lst ")
                found = true
            } else if(i % 3 == 0){
                stringBuilder.append("Mentor ")
                found = true
            }
        }

        // If all conditions fail
        if(!found){
            stringBuilder.append("N/A")
        }

        return stringBuilder.toString()
    }

}