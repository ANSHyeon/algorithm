class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer = mutableListOf<Int>()

        var keyList = mutableListOf<List<String>>()
        
        val maxLeng = keymap.maxOf{it.length}
        
        for(i in 0 until maxLeng){
            var tempList = keymap.map{it.filterIndexed{
                                index,str -> index==i
                            }}
            keyList.add(tempList)
        }
        
        for(i in targets){
            
            var temp = i.map{
                var count = 0
                for(j in 0 until maxLeng){
                    if(it.toString() in keyList[j]){
                        count += (j+1)
                        break
                    }
                    else if(j == maxLeng-1){
                        count = 0 
                        break
                    }
                }
                count
            }
            
            if(temp.minOf{it} == 0) {
                answer.add(-1)
            }
            else{
                answer.add(temp.sumOf{it})
            }
        }
            
        return answer.toIntArray()
    }
}