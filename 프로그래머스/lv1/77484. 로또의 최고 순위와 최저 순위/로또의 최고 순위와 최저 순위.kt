class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var firstRank = whatRank(lottos.count{it==0 || it in win_nums})
        var secondRank = whatRank(lottos.count{it in win_nums})
               
        var answer: IntArray = intArrayOf(firstRank,secondRank)
        return answer
    }
    
    fun whatRank(num: Int):Int {
        return when(num){
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
}