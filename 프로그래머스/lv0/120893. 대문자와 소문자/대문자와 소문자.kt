class Solution {
    fun solution(my_string: String): String {
        var answer: String =  my_string.map{
            when{
                it in ('a'..'z') -> it.toUpperCase()
                else -> it.toLowerCase()
            }
        }.joinToString("")
        return answer
    }
}