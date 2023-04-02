class Solution {
    fun solution(n: Int): Int {
        var answer: Int = n/gcd(6,n)
        return answer
    }
    fun gcd(a:Int, b:Int): Int{
        if(a%b==0) return  b
        else return gcd(b,a%b)
    }
}