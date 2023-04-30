import java.util.*

class Solution {
    fun solution(ingredient: IntArray): Int {
        var tempStack = Stack<Int>()
        
        ingredient.forEachIndexed{ i, num ->
            tempStack.push(num)
            if(tempStack.size>3){
                var lastIndex = tempStack.lastIndex
                if(tempStack[lastIndex]==1 && tempStack[lastIndex-1]==3 &&
                tempStack[lastIndex-2]==2 && tempStack[lastIndex-3]==1){
                    tempStack.pop()
                    tempStack.pop()
                    tempStack.pop()
                    tempStack.pop()
                }
            }
        }
        
        var answer: Int = (ingredient.size - tempStack.size)/4
        
        return answer
    }
}