class Solution {
    fun solution(money: Int): IntArray {
        var answer: IntArray = intArrayOf(money/5500,money%5500)
        return answer
    }
}