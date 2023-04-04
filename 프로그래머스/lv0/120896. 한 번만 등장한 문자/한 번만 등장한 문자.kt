class Solution {
    fun solution(s: String)=s.toCharArray().filter{i->s.toCharArray().filter{i==it}.size==1}.sorted().joinToString("")
}