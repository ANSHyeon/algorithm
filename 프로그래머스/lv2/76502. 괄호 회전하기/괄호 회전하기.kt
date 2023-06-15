class Solution {
    fun solution(s: String): Int {
        
        var answer: Int = 0
        
        for(i in 0 until s.length){
            val str = s.substring(i) + s.substring(0..i-1)
            if(isNice(str)){
                answer++
            }
        }
        
        return answer
    }
    fun isNice(s: String): Boolean {
        var str = s
        repeat(s.length/2){
            str=str.replace("[]","").replace("()","").replace("{}","")
        }
        return if(str.length==0) true else false
    }
}