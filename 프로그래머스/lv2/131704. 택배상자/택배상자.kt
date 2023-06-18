import java.util.*

class Solution {
    fun solution(order: IntArray): Int {
        var answer = 0
        var index = 0
        val stack = Stack<Int>()
        
        for(i in 1..order.size){
            var runElse = false
            if(i==order[index]){
                answer++
                index++
            }
            else{
                runElse = true
            }
            while(stack.isNotEmpty() && stack.peek()==order[index]){
                answer++
                stack.pop()
                index++
            }
            if(runElse){
                stack.push(i)
            }
            
        }
        
        return answer
    }
}