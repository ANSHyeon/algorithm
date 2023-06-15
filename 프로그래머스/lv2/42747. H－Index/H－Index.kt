class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        var arr = citations.sorted().reversed()
        
        for(num in arr.maxOf{it} downTo 1){
            if(num <= arr.count{it>=num}){
                answer = num
                break
            }
        }
        
        return answer
    }
}