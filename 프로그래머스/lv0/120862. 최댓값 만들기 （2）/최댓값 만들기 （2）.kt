class Solution {
    fun solution(numbers: IntArray): Int {
        var numArray = numbers.sorted()
        var answer: Int = 
        if(numArray[numArray.lastIndex]*numArray[numArray.lastIndex-1] > numArray[0]*numArray[1])
            numArray[numArray.lastIndex]*numArray[numArray.lastIndex-1]
        else numArray[0]*numArray[1]
        return answer
    }
}