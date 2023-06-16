class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val group = clothes.groupBy{it[1]}
        var answer = 1
        
        group.keys.forEach{
            answer = answer * (group[it]!!.size + 1)
        }
        
        return answer-1
    }
}