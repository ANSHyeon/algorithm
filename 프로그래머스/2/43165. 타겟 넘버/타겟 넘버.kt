class Solution {
    var answer = 0

    fun solution(numbers: IntArray, target: Int): Int {
        sol(numbers, 0, target, 0)
        return answer
    }

    fun sol(numbers: IntArray, sum: Int, target: Int, level: Int) {
        if (level == numbers.size) {
            if (sum == target) answer++
        } else {
            val num = numbers[level]
            sol(numbers, sum + num, target, level + 1)
            sol(numbers, sum - num, target, level + 1)
        }
    }
}