class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double
        var sum : Double = 0.0
        for(n in numbers){
            sum += n
        }
        answer = sum/numbers.size
        return answer
    }
}