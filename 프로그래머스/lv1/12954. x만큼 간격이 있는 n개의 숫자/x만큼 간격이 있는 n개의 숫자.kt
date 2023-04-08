class Solution {
    fun solution(x: Int, n: Int): LongArray {
        
        var list = mutableListOf<Long>()
        var num: Long = x.toLong()
        
        repeat(n){
            list.add(num)
            num += x.toLong()
        }
        
        var answer = list.toLongArray()
        
        return answer
    }
}