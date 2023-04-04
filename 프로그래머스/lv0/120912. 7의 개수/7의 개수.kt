class Solution {
    fun solution(array: IntArray)=array.joinToString("").toCharArray().count{it.digitToInt()==7}
}