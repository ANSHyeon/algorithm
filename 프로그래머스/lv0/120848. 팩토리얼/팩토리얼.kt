class Solution {
    fun solution(n: Int): Int {
        var answer = 1
        while(fac(answer+1,1)<=n){
            answer++
        }
        return answer
        
    }
    
    fun fac(num:Int, acc:Int):Int{
        if(num<=0) return acc
        else return fac(num-1,num*acc)
    }
}