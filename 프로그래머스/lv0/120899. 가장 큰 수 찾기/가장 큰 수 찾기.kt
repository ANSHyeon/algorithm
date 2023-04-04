class Solution {
    fun solution(array: IntArray): IntArray {
        var maxNum = array.sorted()[array.lastIndex]
        var answer: IntArray = intArrayOf(maxNum,array.indexOf(maxNum))
        return answer
    }
}