class Solution {
    fun solution(s: String, n: Int): String {
        var result = StringBuilder()
        
        for(str in s){
            if(str == ' ') result.append(" ")
            else if(str+n in ('A'..'Z')) result.append(str+n)
            else if(str in ('a'..'z') && str+n in ('a'..'z')) result.append(str+n)
            else result.append(str+n-26)
        }
        
        var answer = result.toString()
        return answer
    }
}