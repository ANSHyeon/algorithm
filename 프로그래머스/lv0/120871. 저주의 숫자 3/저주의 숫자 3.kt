class Solution {
    fun solution(n: Int): Int {
        var count = 1
        for(i in 2..n){
            count++
            while(count%3==0 || count.toString().contains("3")){
                count++}  
        }
        var answer: Int = count
        return answer
    }
}