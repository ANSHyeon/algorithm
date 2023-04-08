class Solution {
    fun solution(a: Int, b: Int): Long {
        
        var answer: Long = 
            if(a>b)
                (b..a).sumOf{it.toLong()}
        
            else
                (a..b).sumOf{it.toLong()}
        return answer
    }
}