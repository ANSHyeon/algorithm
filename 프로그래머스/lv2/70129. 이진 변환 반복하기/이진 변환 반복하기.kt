class Solution {
    var count = 0
    var removeZeroCount = 0
    fun solution(s: String): IntArray {
        var str = s
        while(str!="1"){
            str = result(str)
        }
        
        return intArrayOf(count,removeZeroCount)  
    }
    
    fun result(s: String): String {
        removeZeroCount += s.count{it=='0'}
        count++
        val length = s.replace("0","").length
        
        return Integer.toBinaryString(length)
    }
}

