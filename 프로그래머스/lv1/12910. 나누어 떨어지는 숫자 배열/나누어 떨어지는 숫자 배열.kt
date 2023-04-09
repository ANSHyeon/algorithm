class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = if(arr.filter{it%divisor==0}.size>0){
            return arr.filter{it%divisor==0}.sorted().toIntArray()
        }
        else{
            return intArrayOf(-1)
        }
        return answer
    }
}