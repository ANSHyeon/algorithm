class Solution { 
    fun solution(n: Int): Int {
        var intArr: Array<Long> = Array(n+1){0.toLong()}
        intArr[1] = 1.toLong()
        
        fun pibonachi(n: Long): Long {
            if(n==1.toLong()) return 1.toLong()
            else if(n==0.toLong()) return 0.toLong()
            else if(intArr[n.toInt()]==0.toLong()){
                intArr[n.toInt()] = ((pibonachi(n-1)%1234567) + pibonachi(n-2)%1234567)%1234567
                return intArr[n.toInt()]
            }
            else return (intArr[n.toInt()-2] + intArr[n.toInt()-1])%1234567
        }
        var answer = pibonachi(n.toLong())
        return answer.toInt()
        
        
        
    }
    
}