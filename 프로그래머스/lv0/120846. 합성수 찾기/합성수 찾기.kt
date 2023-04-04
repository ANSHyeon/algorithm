import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        var sum = 0
        for(i in 1..n){
            var mutableSet = mutableSetOf<Int>()
            for(j in 1..sqrt(i.toDouble()).toInt()){
                if(i%j==0){
                    mutableSet.add(j)
                    mutableSet.add(i/j)
                }
            }
            if(mutableSet.size>=3) sum++
        }

        return sum
    }
}