class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = numbers
        for((index, i) in numbers.withIndex()){
            answer[index] = i*2
        }
        return answer
    }
}