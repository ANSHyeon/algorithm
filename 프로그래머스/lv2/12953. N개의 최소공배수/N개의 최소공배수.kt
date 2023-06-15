class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 1
        arr.forEachIndexed{ i,num ->
            answer = lcm(answer,num)
        }
        return answer
    }
    fun lcm(a: Int, b: Int): Int {
        return a*b / gcd(a,b)
    }
    fun gcd(a: Int, b: Int): Int {
        if(a%b==0) return b
        else return gcd(b,a%b)
    }
}