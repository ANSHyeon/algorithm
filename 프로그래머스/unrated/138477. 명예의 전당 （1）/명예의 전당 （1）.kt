class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var minScore = mutableListOf<Int>()
        var answer = mutableListOf<Int>()
        for((i,num) in score.withIndex()){
            if(i <= k-1){
                answer.add(num)   
            }
            else{
                if(answer.minOf{it}<num){
                    answer.add(num) 
                    answer.remove(answer.minOf{it})
                }
            }
            minScore.add(answer.minOf{it})
            
        }
        
        return minScore.toIntArray()
    }
}