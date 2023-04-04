class Solution {
    fun solution(my_string: String): Int {
        var sum = 0
        var flag = false
        for(i in my_string.split(" ")){
            if(i=="-"){
                flag = true
            } 
            if(!flag && i !="+"){
                sum+=i.toInt()
            }
            if(flag &&i !="-" ){
                sum-=i.toInt()
                flag = false
            }
        }
        var answer: Int = sum
        return answer
    }
}