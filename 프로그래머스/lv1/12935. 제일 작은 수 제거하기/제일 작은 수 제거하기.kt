class Solution {
    fun solution(arr: IntArray): IntArray {
        var newArr = arr.filter{i -> i!=arr.minOf{it}}.toIntArray()
        var answer = if(newArr.size>0)   newArr  else intArrayOf(-1)
        return answer
    }
}