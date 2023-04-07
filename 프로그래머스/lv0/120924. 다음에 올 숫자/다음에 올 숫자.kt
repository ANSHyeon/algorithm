class Solution {
    fun solution(common: IntArray): Int {
        var answer: Int = 0
        if((common[1]-common[0])==(common[2]-common[1])){
            answer = common[common.lastIndex]+(common[1]-common[0])
        }
        else{
            answer = common[common.lastIndex] * (common[1]/common[0])
        }
        
        return answer
    }
}