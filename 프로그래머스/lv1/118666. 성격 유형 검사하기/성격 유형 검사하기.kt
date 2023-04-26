class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var str = StringBuilder()
        var scoreMap = mutableMapOf<String,Int>(
            "R" to 0,
            "T" to 0,
            "C" to 0,
            "F" to 0,
            "J" to 0,
            "M" to 0,
            "A" to 0,
            "N" to 0,
        )
        
        for(i in 0 until choices.size){
            if(choices[i]<4){
                var temp = scoreMap[survey[i][0].toString()]
                scoreMap[survey[i][0].toString()] = temp!!+(4-choices[i])
            }
            else if(choices[i]>4){
                var temp = scoreMap[survey[i][1].toString()]
                scoreMap[survey[i][1].toString()] = temp!!+(choices[i]-4)
            }
        }
        if(scoreMap["R"]!!>=scoreMap["T"]!!) str.append("R")
        else str.append("T")
        
        if(scoreMap["C"]!!>=scoreMap["F"]!!) str.append("C")
        else str.append("F")
        
        if(scoreMap["J"]!!>=scoreMap["M"]!!) str.append("J")
        else str.append("M")
        
        if(scoreMap["A"]!!>=scoreMap["N"]!!) str.append("A")
        else str.append("N")
        
        var answer: String = str.toString()
        return answer
    }
}