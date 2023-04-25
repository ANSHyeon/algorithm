class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val newLost = lost.filter{!(it in reserve)}
        val newReserve = reserve.filter{!(it in lost)}.sorted()
        var array = Array(n+2){0}
        
        for(i in newLost){
            array[i] = 1
        }
        
        for(i in newReserve){
            if(array[i-1]==1) array[i-1]=0
            else if(array[i+1]==1) array[i+1]=0
            
        }
        var answer = n-array.count{it==1}
        return answer
    }
}