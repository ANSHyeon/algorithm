class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var xDots = dots.map{it[0]}.toSet().toIntArray().sorted()
        var yDots = dots.map{it[1]}.toSet().toIntArray().sorted()
        
        var answer: Int = (xDots[1]-xDots[0])*(yDots[1]-yDots[0])
        return answer
    }
}