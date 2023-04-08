class Solution {
    fun solution(n: Int): Int {
        var answer: Int = (1..n).filter{n%it==1}[0]
        return answer
    }
}