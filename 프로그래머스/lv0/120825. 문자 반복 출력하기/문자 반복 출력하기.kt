class Solution {
    fun solution(my_string: String, n: Int): String {
        var s = StringBuilder("")
        for(i in 0 until my_string.length){
            for(j in 1..n){
                s.append(my_string[i])
            }
        }
        return s.toString()
    }
}