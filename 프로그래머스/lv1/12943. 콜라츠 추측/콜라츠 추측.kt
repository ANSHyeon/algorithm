class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var caculatedNum = num.toLong()
        while(caculatedNum != 1.toLong() && answer<500){
            if(caculatedNum%2.toLong()==0.toLong()){
                caculatedNum = caculatedNum/2.toLong()
            }   
            else{
                caculatedNum = (caculatedNum*3.toLong()) +1.toLong()
            }   
            answer += 1
        }
        if(answer == 500) answer =-1
        return answer
    }
}