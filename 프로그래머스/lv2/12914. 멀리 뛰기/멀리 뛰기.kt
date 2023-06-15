class Solution {
    fun solution(n: Int): Long {
        var arr = Array(n+1){0.toLong()}
        arr[0] = 1.toLong()
        arr[1] = 1.toLong()
        
        fun result(n: Int): Long {
            if(arr[n]==0.toLong()) arr[n] = (result(n-1) + result(n-2)) % 1234567
            return arr[n]
        }
        
        var answer: Long = result(n)
        return answer
    }
}