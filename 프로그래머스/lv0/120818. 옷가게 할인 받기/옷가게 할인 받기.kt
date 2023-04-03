import kotlin.math.floor
class Solution {
    fun solution(price: Int): Int {
        return when{
            price>=500000 -> floor(price*0.80).toInt()
            price>=300000 -> floor(price*0.90).toInt()
            price>=100000 -> floor(price*0.95).toInt()
            else -> price
        }
    }
}