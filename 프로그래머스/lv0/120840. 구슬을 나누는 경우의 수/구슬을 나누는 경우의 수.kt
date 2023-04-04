import java.math.BigInteger

class Solution {

    fun solution(balls: Int, share: Int): BigInteger {
        var answer: BigInteger = factorial(balls,1.toBigInteger())/(factorial(share,1.toBigInteger())*factorial(balls-share,1.toBigInteger()))
        return answer
    }

    fun factorial(n:Int, acc:BigInteger): BigInteger {
        if(n<=0) return acc
        else return factorial(n-1,n.toBigInteger()*acc)
    }
}