class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var result = mutableListOf<Int>()
        
        var tempArray = wallpaper.map{str->
            str.mapIndexed{ i, it->
                if(it=='#') i else '.'
            }.filter{it!='.'}
        }
       
        for((i,str) in tempArray.withIndex()){
            if(str.isNotEmpty()){
                result.add(i)
                break
            }
        }
        var minList = mutableListOf<Int>()
        var maxList = mutableListOf<Int>()
        
        for(i in tempArray){
            if(i.isNotEmpty()){
                minList.add(i[0].toString().toInt())
                maxList.add(i[i.lastIndex].toString().toInt())
            }
                
        }
        result.add(minList.minOf{it})
    
        for((i,str) in tempArray.reversed().withIndex()){
            if(str.isNotEmpty()){
                result.add(tempArray.size-i)
                break
            }
        }
        result.add(maxList.maxOf{it}+1)
        var answer: IntArray = result.toIntArray()
        return answer
    }
}