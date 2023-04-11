class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = sizes.map{i->i.maxOf{it}}.maxOf{it} * sizes.map{i->i.minOf{it}}.maxOf{it}
        return answer
    }
}