class Solution {
    fun solution(before: String, after: String)=
        if(before.toCharArray().sorted().joinToString("")
        ==after.toCharArray().sorted().joinToString("")) 1
        else 0
}