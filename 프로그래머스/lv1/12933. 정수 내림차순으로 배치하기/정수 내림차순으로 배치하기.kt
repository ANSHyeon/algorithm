class Solution {
    fun solution(n: Long): Long {
        var answer: Long = n.toString().map{it.toString().toInt()}.sorted().reversed().joinToString("").toLong()
        return answer
    }
}