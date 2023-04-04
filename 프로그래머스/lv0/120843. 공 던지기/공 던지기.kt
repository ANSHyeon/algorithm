class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var index = ((k-1)*2)%numbers.size
        var answer: Int = numbers[index]
        return answer
    }
}