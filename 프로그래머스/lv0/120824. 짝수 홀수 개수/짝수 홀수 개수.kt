class Solution {
    fun solution(num_list: IntArray): IntArray {
        var even = 0
        var odd = 0
        
        for(i in num_list){
            if(i%2==0) even++
            else odd++
        }
        var answer: IntArray = intArrayOf(even,odd)
        return answer
    }
}