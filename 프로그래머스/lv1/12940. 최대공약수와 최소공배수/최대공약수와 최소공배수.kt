class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var gcdNum = gcd(n,m)
        var answer = intArrayOf(gcdNum,(n*m)/gcdNum)
        return answer
    }
    fun gcd(a: Int, b: Int): Int {
        if(a%b==0) return b
        else return gcd(b,a%b)
    }
}