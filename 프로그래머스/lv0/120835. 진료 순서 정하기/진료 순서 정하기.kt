class Solution {
    fun solution(emergency: IntArray): IntArray {
    val reverseSortedArray = emergency.sorted().reversed()
    var answer: IntArray = emergency.map{reverseSortedArray.indexOf(it)+1}.toIntArray()
    return answer
}
}