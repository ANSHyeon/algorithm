class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var list = IntArray(201,{0})
        
        for(i in 0..2){
            for(j in (lines[i][0]+1)..lines[i][1]){
                list[j+100]++
            }
        }
        
        
        var answer: Int = list.count{it>1}
        return answer
    }
}