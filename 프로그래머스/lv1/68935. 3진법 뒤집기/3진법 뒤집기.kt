import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        var thrNum = StringBuilder()
        var num = n
        while(num!=0){
            thrNum.append(num%3)
            num /= 3
        }
        
        var answer: Int = thrNum.toString().reversed().mapIndexed{
            i,num -> num.toString().toInt() * 3.toDouble().pow(i.toDouble()).toInt()
        }.sum()
        return answer
    }
}