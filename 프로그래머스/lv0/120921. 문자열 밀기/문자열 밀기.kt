class Solution {
    fun solution(A: String, B: String): Int {
        var a = A
        var count = 0
        var b = 0
        var result:Int = if(a.equals(B)) return 0
        else {
            for(i in 1..a.length){
                a=(a.substring((a.lastIndex)..(a.lastIndex)) + a.substring(0 until (a.lastIndex)))
                count++
                if(a.equals(B)) {
                    b = count
                    break
                }
            }
            when{
                b>0 -> return b
                else -> return -1
            }
        }
        
        var answer: Int = result
        return answer
    }
}