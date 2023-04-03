class Solution {
    fun solution(num_list: IntArray): IntArray {
        var size = num_list.size
        var reserved_list: IntArray = IntArray(size,{0})
        for((index, i) in num_list.withIndex()){
            reserved_list[size-index-1]=i
        }
        return reserved_list
    }
}