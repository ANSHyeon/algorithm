class Solution {
    fun solution(s: String): String {
        
        var answer = s.split(" ").map{
            it.mapIndexed{
                i,str -> if(i%2==0) str.toUpperCase() else str.toLowerCase()
            }.joinToString("")
        }.joinToString(" ")
        return answer
    }
}