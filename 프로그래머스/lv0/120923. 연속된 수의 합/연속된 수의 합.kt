class Solution {
    fun solution(num: Int, total: Int): IntArray {
        
        var resultArray = mutableListOf<Int>()
        var sum = 0
        for(i in 1 until num){
            sum+=i
        }
        var deferent = (total-sum)/num
        for(i in 0 until num){
            resultArray.add(i+deferent)
        }
        var answer: IntArray = resultArray.toIntArray()
        return answer
    }
}