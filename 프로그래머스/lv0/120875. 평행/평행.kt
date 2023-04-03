class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var x1 = dots[0][0]
        var x2 = dots[1][0]
        var x3 = dots[2][0]
        var x4 = dots[3][0]
        var y1 = dots[0][1]
        var y2 = dots[1][1]
        var y3 = dots[2][1]
        var y4 = dots[3][1]
        
        
        
        return when{
            ((y1-y2)/(x1-x2) == (y3-y4)/(x3-x4)) && 
            ((y1-y2)%(x1-x2) == (y3-y4)%(x3-x4)) -> 1
            
            ((y1-y3)/(x1-x3) == (y2-y4)/(x2-x4)) && 
            ((y1-y3)%(x1-x3) == (y2-y4)%(x2-x4)) -> 1
            
            ((y1-y4)/(x1-x4) == (y3-y2)/(x3-x2)) && 
            ((y1-y4)%(x1-x4) == (y3-y2)%(x3-x2)) -> 1
            
            else -> 0
        }
    }
}