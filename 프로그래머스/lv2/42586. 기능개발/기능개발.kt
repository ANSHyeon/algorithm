class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var list = mutableListOf<Int>()
        var result = mutableListOf<Int>()
        progresses.forEachIndexed{ i, num->
            val date: Int
            
            if((100-num)%speeds[i] == 0) {
                date = (100-num)/speeds[i]
            }else {
                date = (100-num)/speeds[i] + 1
            }
            list.add(date)
        }
        
        while(list.size>0){
            val size = list.size
            val first = list.first()
            var count = 0
            for(i in list){
                if(i<=first) count++
                else break
            }
            result.add(count)
            repeat(count){
                list.removeAt(0)
            }
        }
        var answer = result.toIntArray()
        return answer
    }
}