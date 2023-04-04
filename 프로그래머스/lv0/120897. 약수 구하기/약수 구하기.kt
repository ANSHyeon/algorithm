import kotlin.math.*

class Solution {
    fun solution(n: Int): IntArray {
        var list = mutableSetOf<Int>()
        for(i in 1 .. sqrt(n.toDouble()).toInt()){
            if(n%i==0){
                list.add(i)
                list.add(n/i)
            }
        }
        var answer: IntArray = list.toIntArray().sortedArray()
        return answer
    }
}