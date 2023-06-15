import kotlin.math.*

class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var A = min(a,b)
        var B = max(a,b)
        var N = n
        var answer = 0
    
        while(true){
        
            if(A==B) break
                
            
            N /= 2
            A = ceil(A.toDouble()/2).toInt()
            B = ceil(B.toDouble()/2).toInt()
            answer++
        }

        return answer
    }
}