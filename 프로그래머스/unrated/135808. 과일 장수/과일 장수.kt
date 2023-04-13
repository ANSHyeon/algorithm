class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var scoreList = score.sorted().reversed()
        var index = 0
        var answer: Int = 0
        while(scoreList.size-index>=m){
            var tempList = mutableListOf<Int>()
            repeat(m){
                tempList.add(scoreList[index])
                index++
            }
            answer+=tempList.minOf{it}*m
        }
        
        return answer
    }
}