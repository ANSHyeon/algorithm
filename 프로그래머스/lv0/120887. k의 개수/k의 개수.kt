class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        
        var answer: Int = (i..j).map{a ->
            a.toString().toCharArray().filter{it==k.digitToChar()}.size
        }.sum()
        return answer
    }
}