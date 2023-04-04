import kotlin.math.*

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var value = array.sorted().map{abs(n-it.toInt())}
        print(value.indexOf(value.minOf{it}))
        var answer: Int = array.sorted()[value.indexOf(value.minOf{it})]
        return answer
    }
}