import kotlin.math.roundToInt

class Solution {
    fun solution(num1: Int, num2: Int) : Int{
        val answer = (num1*1.0)/num2
        return (answer*1000).toInt()
    }
}