class Solution {
    fun solution(numbers: IntArray): IntArray {
        var resultSet = mutableSetOf<Int>()
        
        for(i in 0 until numbers.lastIndex){
            for(j in i+1 .. numbers.lastIndex){
                resultSet.add(numbers[i]+numbers[j])
            }
        }
        var answer: IntArray = resultSet.toIntArray().sortedArray()
        return answer
    }
}