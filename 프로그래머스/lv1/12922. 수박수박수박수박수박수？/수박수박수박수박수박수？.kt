class Solution {
    fun solution(n: Int): String {
        val str = StringBuilder()
        for(i in 1..n){
            if(i%2==0) str.append("박")
            else str.append("수")
        }
        var answer = str.toString()
        return answer
    }
}