class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array<IntArray>(arr1.size){intArrayOf(arr2[0].size)}
        
        arr1.forEachIndexed{ index, arrA ->
            var tempList = mutableListOf<Int>()
            for(i in 0 until arr2[0].size){
                var sum = 0
                arrA.forEachIndexed{ secondIndex, num->
                    sum += num*arr2[secondIndex][i]
                }
                tempList.add(sum)
                
            }
            answer[index] = tempList.toIntArray()
        }
               
        
        
        val a = Array<IntArray>(3){intArrayOf(1,2,3)}
        return answer
    }
}