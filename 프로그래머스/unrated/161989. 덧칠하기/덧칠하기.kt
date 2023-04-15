class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var newSection = section.toMutableList()
        var answer: Int = 0
        
        while(newSection.size>0){
            var minNum = newSection.minOf{it}
            for(i in 0 until m){
                newSection.remove(minNum+i)
            }
            answer++
        }
        return answer
    }
}