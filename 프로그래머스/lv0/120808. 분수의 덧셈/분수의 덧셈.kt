class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var numer = (numer1*denom2)+(numer2*denom1)
        var denom = denom1*denom2
        for(i in denom/2 downTo 1){
            if((denom % i == 0) && (numer % i == 0)){
                numer /= i
                denom /= i
            }
        }
        answer = intArrayOf(numer,denom)
        return answer
    }
}