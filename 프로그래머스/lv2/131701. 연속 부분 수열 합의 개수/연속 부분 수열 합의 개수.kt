class Solution {
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        val size = elements.size
        var arr = Array(size*2 -1){0}
        
        var sett = mutableSetOf(0)
        
        elements.forEachIndexed{ i, num ->
            arr[i] = num
            if(i+size < arr.size)  arr[i+size] = num
        }
        
        for(i in 0 until size){
           for(j in 0 until size){
               var sum = 0
               for(k in 0..i){
                    sum += arr[j+k]
                }
               sett.add(sum)  
           } 
        }
        
        return sett.size-1
    }
}