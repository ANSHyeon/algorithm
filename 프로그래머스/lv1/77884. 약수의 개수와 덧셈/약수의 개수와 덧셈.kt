import kotlin.math.*

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = (left..right).map{if(count(it)%2==0) it else 0-it}.sum()
        return answer
    }
    fun count(num: Int): Int{
        var numSet = mutableSetOf<Int>()
        for(i in 1..sqrt(num.toDouble()).toInt()){
            if(num%i==0){
                numSet.add(i)
                numSet.add(num/i)
            }                
        }
        return numSet.size
    }
}