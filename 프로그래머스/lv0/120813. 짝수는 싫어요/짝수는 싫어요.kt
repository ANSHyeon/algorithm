class Solution {
    fun solution(n: Int): IntArray {
        var list = 
        if(n%2==0) IntArray(n/2,{0})
        else IntArray((n/2)+1,{0})
        list[0]=1
        for(i in 1 until list.size){
            list[i] = list[i-1]+2
        }
        var answer: IntArray = list
        return answer
    }
}