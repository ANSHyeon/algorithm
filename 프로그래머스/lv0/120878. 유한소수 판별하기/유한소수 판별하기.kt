class Solution {
    fun solution(a: Int, b: Int): Int {
        var bunmo = b/(gcd(a,b))
        while(bunmo%2==0){
            bunmo/=2
        }
        while(bunmo%5==0){
            bunmo/=5
        }
        
        var answer: Int = if(bunmo==1) 1 else 2
        return answer
    }
    fun gcd(a: Int, b: Int): Int{
        if(a%b == 0) return b
        else return gcd(b, a%b)
    }
}