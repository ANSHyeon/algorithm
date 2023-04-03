class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var list = IntArray(strlist.size,{0})
        for((index,i) in strlist.withIndex()){
            list[index]=i.length
        }
        
        return list
    }
}