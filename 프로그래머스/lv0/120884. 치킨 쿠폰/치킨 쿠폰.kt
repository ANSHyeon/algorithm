class Solution {
    fun solution(chicken: Int): Int {
        
        var total = chicken/10
        var chi = (chicken%10)+total
        
        while(chi/10 > 0){
            total += (chi/10)
            chi = (chi%10)+chi/10
            
        }
        
        var answer: Int = total
        return answer
    }
}