class Solution {
    fun solution(board: Array<IntArray>): Int {
        
        
        for(i in 0 until board.size){
            for(j in 0 until board.size){
                for(k in -1..1){
                    for(l in -1..1){
                        if((((i-k)>-1) && ((i-k)< board.size)) && ( ((j-l)>-1) && ((j-l)< board.size))){
                            if(board[i-k][j-l]==1 && board[i][j]==0) board[i][j] =2
                        }
                    }
                }
            }
        }
        //print(board.map{it.count{it==0}}.sumOf{it})
        
        var answer: Int = board.map{it.count{it==0}}.sumOf{it}
        return answer
    }
}