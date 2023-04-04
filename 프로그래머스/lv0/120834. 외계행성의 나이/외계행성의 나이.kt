class Solution {
    fun solution(age: Int): String {
        var answer: String = age.toString().toCharArray().map{it+49}.joinToString("")
        return answer
    }
}