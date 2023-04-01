class Solution {
    fun solution(n: Int, k: Int): Int {
        val sheepPrice = n * 12000
        val drinkCount = k-(n/10)
        val drinkPrice = drinkCount*2000
        var answer: Int = sheepPrice + drinkPrice
        return answer
    }
}