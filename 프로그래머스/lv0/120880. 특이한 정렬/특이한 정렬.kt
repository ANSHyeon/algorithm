import kotlin.math.*

class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        
        val comparator: Comparator<Int>  = compareBy { abs(n-it) }
        val result = numlist.sortedWith(comparator.thenBy{it*-1})
  
        var answer: IntArray = result.toIntArray()
        return answer
    }
}