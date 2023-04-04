class Solution {
    fun solution(num: Int, k: Int) = if(num.toString().toCharArray().count {it.digitToInt() == k}>0)
    num.toString().toCharArray().indexOf(k.digitToChar())+1
else -1
}