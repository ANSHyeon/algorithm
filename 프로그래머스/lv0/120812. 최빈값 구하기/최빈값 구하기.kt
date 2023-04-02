class Solution {
    fun solution(array: IntArray): Int {
        var list = Array<Int>(1000){i->0}
        var max : Int = 0
        var index : Int = 0
        for(i in array){
            list[i]++
            if (max < list[i]) {
                max = list[i]
                index = i
            }
        }
        var answer: Int = when{
            list.sorted().reversed()[0]==list.sorted().reversed()[1] -> -1
            else -> index
        }
        return answer
    }
}