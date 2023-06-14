class Solution {
    fun solution(s: String): String {
        var result = StringBuilder()
        val str = s.split(" ")
        
        result.append(str.map{str -> str.toInt()}.minOf{it})
        result.append(" ")
        result.append(str.map{str -> str.toInt()}.maxOf{it})
     
        return result.toString()
    }
}