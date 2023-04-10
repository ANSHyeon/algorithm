class Solution {
    fun solution(s: String): String {
        var answer = s.toCharArray().sorted().reversed().joinToString("")
        return answer
    }
}