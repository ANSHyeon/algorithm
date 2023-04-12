class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = s.mapIndexed{i,str ->
            if(s.lastIndexOf(str,i-1)==-1)  -1
            else    i - s.lastIndexOf(str,i-1)
        }.toIntArray()
        return answer
    }
}