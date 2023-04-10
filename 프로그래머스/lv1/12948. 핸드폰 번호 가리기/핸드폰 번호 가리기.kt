class Solution {
    fun solution(phone_number: String): String {
        var lastIndex = phone_number.lastIndex
        var answer = "*".repeat(phone_number.length-4)+phone_number.substring(lastIndex-3)
        return answer
    }
}