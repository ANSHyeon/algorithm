import kotlin.math.*

class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var column = 0
        var row = 0
        val total = brown + yellow
        val sqrtTotal = ceil(sqrt(total.toDouble())).toInt()
        for(i in sqrtTotal..total){
            if(total%i==0){
                val secondNum = total/i
                val tempNum = (i+secondNum)*2 - 4
                if(tempNum==brown){
                    column = i
                    row =secondNum
                }
            }
        }
        var answer = intArrayOf(column,row)
        return answer
    }
}