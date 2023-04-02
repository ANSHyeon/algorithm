class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = (n+(slice-1))/slice
        return answer
    }
}