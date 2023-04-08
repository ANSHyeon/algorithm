class Solution {
    fun solution(x: Int): Boolean {
        print(x.toString().map{it.toString().toInt()}.sum())
        
        var answer = if(x%x.toString().map{it.toString().toInt()}.sum()==0) true
                    else false
        return answer
    }
}