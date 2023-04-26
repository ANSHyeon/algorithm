class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var string = s
        var index = 0
            for(i in 1 until string.length){
                var firstStr = string[index]
                var str = string.substring(index..i)
                
                if(str.toCharArray().count{it == firstStr}*2 == str.length){
                    index = i+1
                    answer++
                }
            }

        if(index<s.length) answer++
        
        return answer
    }
}