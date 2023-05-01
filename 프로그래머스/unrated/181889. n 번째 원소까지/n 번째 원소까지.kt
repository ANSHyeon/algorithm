class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = num_list.filterIndexed{i,num -> i<n}.toIntArray()
        return answer
    }
}