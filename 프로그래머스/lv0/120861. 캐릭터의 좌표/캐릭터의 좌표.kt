class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        
        var xDot = 0
        var yDot = 0
        var xMax = board[0]/2
        var xMin = 0-(board[0]/2)
        var yMax = board[1]/2
        var yMin = 0-(board[1]/2)
        
        for(str in keyinput){
            when(str){
                "left" -> if(xDot>xMin) xDot--
                "right" -> if(xDot<xMax) xDot++
                "down" -> if(yDot>yMin) yDot--
                "up" -> if(yDot<yMax) yDot++
            }
        }
        
        var answer: IntArray = intArrayOf(xDot,yDot)
        return answer
    }
}