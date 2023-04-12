import kotlin.math.*

class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        for(i in 0..nums.size-3){
            for(j in i+1..nums.size-2){
                for(k in j+1..nums.size-1){
                    if(isSoSu(nums[i]+nums[j]+nums[k])) answer++
                }
            }
        }   
        return answer
    }
    
    fun isSoSu(num: Int): Boolean {
        if(num%2 == 0) return false
        for(i in 3..sqrt(num.toDouble()).toInt() step 2){
            if(num%i == 0) return false
        }
        return true
    }
}