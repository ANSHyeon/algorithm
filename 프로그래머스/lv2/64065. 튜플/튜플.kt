class Solution {
    fun solution(s: String): IntArray {
        var str = s.replace("{{","").replace("}}","").split("},{").map{it.split(",")}
        str = str.sortedBy{it.size}
        var list = mutableListOf<Int>()
        
        str.forEachIndexed{ i, arr ->
            if(i>0){
                val temp = arr.filter{it !in str[i-1]}
                list.add(temp[0].toString().toInt())
            }else{
                list.add(arr[0].toString().toInt())
            }
        }
        var answer = list.toIntArray()
        return answer
    }
}