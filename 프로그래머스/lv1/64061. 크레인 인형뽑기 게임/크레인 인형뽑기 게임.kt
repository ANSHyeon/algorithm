import java.util.Stack
class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var dollStack = Stack<Int>()
        var answer = 0
        
        for(i in moves){
            var boardSize = 0
            while(true){
                var temp = board[boardSize][i-1]
                if(temp != 0){
                    if(dollStack.isNotEmpty() && temp==dollStack.peek()){
                        dollStack.pop()
                        answer+=2
                    }
                    else{
                        dollStack.push(temp)
                    }
                    board[boardSize][i-1] = 0
                    break
                }
                boardSize++
                if(boardSize==board.size) break
            }
            
        }
        
        return answer
    }
}