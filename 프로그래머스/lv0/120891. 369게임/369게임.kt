class Solution {
    fun solution(order: Int): Int {
        var answer: Int = order.toString().toCharArray().count{(it.digitToInt()!=0)&&(it.digitToInt()%3==0)}
        return answer
    }
}