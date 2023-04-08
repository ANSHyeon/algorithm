import kotlin.math.*
class Solution {
    fun solution(n: Long): Long {
        var sqrtNum = sqrt(n.toDouble()).toLong()
        
        
        var answer: Long = if(sqrtNum*sqrtNum == n){
            (sqrtNum+1)*(sqrtNum+1)
        }
        else {
            -1
        }
        return answer
    }
}