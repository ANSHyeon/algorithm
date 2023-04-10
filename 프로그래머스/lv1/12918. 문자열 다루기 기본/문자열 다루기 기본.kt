class Solution {
    fun solution(s: String): Boolean {        
        
        var answer = if((s.length==4 || s.length==6)&&(s.toCharArray().count{it.isDigit()}==s.length)){
            true
        }else{
            false
        }
        return answer
    }
}