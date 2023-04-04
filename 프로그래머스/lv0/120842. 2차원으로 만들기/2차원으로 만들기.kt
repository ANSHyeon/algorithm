class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
    var answer: Array<IntArray> = Array(num_list.size/n , {IntArray(n,{0})})
    for(i in 0 until num_list.size){
        answer[i/n][i%n] = num_list[i]
    }

    return answer
}
}