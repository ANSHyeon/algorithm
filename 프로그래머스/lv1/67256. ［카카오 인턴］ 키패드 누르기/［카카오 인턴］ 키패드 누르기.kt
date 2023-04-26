import kotlin.math.*

class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        
        var str = StringBuilder()
        var left = 10
        var right = 12
        
        fun appendLeft(num: Int): Unit{
            str.append("L")
            left = num
        }
        fun appendRight(num: Int): Unit{
            str.append("R")
            right = num
        }
        
        for(i in numbers){
            var num = i
            if(i==0) num = 11 
            
            if(num%3==1){
                appendLeft(num)
            }
            else if(num%3==0){
                appendRight(num)
            }
            else{
                val leftLength = getLength(num,left)
                val rightLength = getLength(num,right)
                if(leftLength<rightLength){
                    appendLeft(num)
                }
                else if(leftLength>rightLength){
                    appendRight(num)
                }
                else{
                    if(hand == "right") {
                        appendRight(num)
                    }
                    else{
                        appendLeft(num)
                    }
                }
                
            }
        }
        var answer = str.toString()
        return answer
    }
    
    fun getLength(num: Int, nowNum: Int): Int{
        val tempNum = nowNum-num
        val count = abs(tempNum/3 + tempNum%3)
        return count
    }
    
    
}