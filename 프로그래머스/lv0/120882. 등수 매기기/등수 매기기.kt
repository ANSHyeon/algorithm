class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        
        var averageScore = score.map{it[0]+it[1]}
        var reverseAverageScore = averageScore.sorted().reversed()
        var rankList = mutableListOf<Int>(1)
        var rank = 2
        var answer = mutableListOf<Int>()
        
        for(i in 1 until score.size){
            if(reverseAverageScore[i]==reverseAverageScore[i-1]){
                rankList.add(rankList[i-1])
                rank++
            }
            else rankList.add(rank++)
        }
        
        for(i in 0 until score.size){
            var index = reverseAverageScore.indexOf(averageScore[i])
            answer.add(rankList[index])
        }
        return answer.toIntArray()
    }
}