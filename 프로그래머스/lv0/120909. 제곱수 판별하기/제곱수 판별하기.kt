import kotlin.math.sqrt

class Solution {
    
    fun solution(n: Int): Int{ 
        var nDouble = n.toDouble()
        var max = 0
        for(i in 1..sqrt(nDouble).toInt()){
            max = i
        }
        return if(max*max == n) 1 else 2
    } 

}