class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = s1.filter{it in s2}.size
        return answer
    }
}