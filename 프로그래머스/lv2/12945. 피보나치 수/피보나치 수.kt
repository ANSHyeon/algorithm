class Solution { 
    fun solution(n: Int): Int {
        var intArr = Array(n+1){0}
        intArr[1] = 1
        
        for(i in 2..n){
            intArr[i] = (intArr[i-1] + intArr[i-2])%1234567
        }
       
        var answer = intArr[n]
        return answer
        
        
        
    }
    
}