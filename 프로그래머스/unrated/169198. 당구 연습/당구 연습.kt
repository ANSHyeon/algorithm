import kotlin.math.*

class Solution {
    fun solution(m: Int, n: Int, startX: Int, startY: Int, balls: Array<IntArray>): IntArray {
        
        var list = mutableListOf<Int>()
        balls.forEach{ ball ->
            val x = ball[0]
            val y = ball[1]
            
            
            
            if(startX==x){
                if(startY<y){
                    val up = 99999999
                    val down = down(m, n, startX, startY, x, y)
                    val left = left(m, n, startX, startY, x, y)
                    val right = right(m, n, startX, startY, x, y)
                    list.add(bestDistance(up, down, left, right))
                    println("1")
                }
                else{
                    val up = up(m, n, startX, startY, x, y)
                    val down = 99999999
                    val left = left(m, n, startX, startY, x, y)
                    val right = right(m, n, startX, startY, x, y)
                    list.add(bestDistance(up, down, left, right))
                    println("2")
                }
                
            }
            else if(startY==y){
                if(startX<x){
                    val up = up(m, n, startX, startY, x, y)
                    val down = down(m, n, startX, startY, x, y)
                    val left = left(m, n, startX, startY, x, y)
                    val right = 99999999
                    list.add(bestDistance(up, down, left, right))
                    println("3")
                }
                else{
                    val up = up(m, n, startX, startY, x, y)
                    val down = down(m, n, startX, startY, x, y)
                    val left = 99999999
                    val right = right(m, n, startX, startY, x, y)
                    list.add(bestDistance(up, down, left, right))
                    println("4")
                }
            }
            else{
                val up = up(m, n, startX, startY, x, y)
                val down = down(m, n, startX, startY, x, y)
                val left = left(m, n, startX, startY, x, y)
                val right = right(m, n, startX, startY, x, y)
                list.add(bestDistance(up, down, left, right))
                println("5")
            }
                
    
        }
        return list.toIntArray()
    }
    
    fun up(m: Int, n: Int, startX: Int, startY: Int, x: Int, y: Int): Int {
        val newX = startX
        val newY = 2*n - startY
        
        return ((newX-x).toFloat().pow(2)+(newY-y).toFloat().pow(2)).toInt()
    }
    fun down(m: Int, n: Int, startX: Int, startY: Int, x: Int, y: Int): Int {
        val newX = startX
        val newY = startY * (-1)
        
        return ((newX-x).toFloat().pow(2)+(newY-y).toFloat().pow(2)).toInt()
    }
    fun left(m: Int, n: Int, startX: Int, startY: Int, x: Int, y: Int): Int {
        val newX = startX * (-1)
        val newY = startY
        
        return ((newX-x).toFloat().pow(2)+(newY-y).toFloat().pow(2)).toInt()
    }
    fun right(m: Int, n: Int, startX: Int, startY: Int, x: Int, y: Int): Int {
        val newX = 2*m - startX
        val newY = startY
        
        return ((newX-x).toFloat().pow(2)+(newY-y).toFloat().pow(2)).toInt()
    }
    
    fun bestDistance(up: Int, down: Int, left:Int, right: Int): Int {
        var min = up
        if(down<min) min = down
        if(left<min) min = left
        if(right<min) min = right
        
        return min
    }
}