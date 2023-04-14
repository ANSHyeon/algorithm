class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        
        var yearningMap = mutableMapOf<String,Int>()
        
        for(i in 0 until name.size){
            yearningMap[name[i]] = yearning[i]
        }
        
        
        var answer: IntArray = photo.map{i->
            i.map{j->
                if(yearningMap.containsKey(j)) yearningMap[j]
                else 0
            }.sumOf{it!!}
        }.toIntArray()
        return answer
    }
}