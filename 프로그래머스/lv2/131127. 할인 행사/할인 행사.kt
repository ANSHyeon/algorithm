class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        
        val discountSize = discount.size
        
        var wantNumber = number
        
        val map = mutableMapOf<String,Int>()
        
        want.forEachIndexed{ i,it ->
            map.put(it,number[i])
        }
        
        for(i in 0 .. discountSize-10){
            var isGo = true
            val tempMap = mutableMapOf<String,Int>()
            tempMap.putAll(map)
            for(j in 0..9){
                if(tempMap[discount[i+j]] != null){
                    if(tempMap[discount[i+j]]!! > 0){
                        tempMap[discount[i+j]] = tempMap[discount[i+j]]!!.minus(1)
                    }
                    else{
                        isGo = false
                        break
                    }
                }
                else{
                    isGo = false
                    break
                }   
            }
            if(isGo && tempMap.values.sumOf{it}==0) answer++
        }
        
        
        
        return answer
    }
}