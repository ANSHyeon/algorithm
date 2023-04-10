class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = absolutes.mapIndexed{i,num -> if(signs[i]==true) num else num*(-1) }.sum()
        return answer
    }
}