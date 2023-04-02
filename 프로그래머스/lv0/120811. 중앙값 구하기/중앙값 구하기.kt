class Solution {
    fun solution(array: IntArray): Int {
        var list = array.sorted()
        var answer: Int = list[list.size/2] 
        return answer
    }
}