class Solution {
    fun solution(numbers: IntArray, direction: String)=when(direction){
        "left" -> {
            var temp = numbers[0]
            var numList = numbers.toMutableList()
            numList.removeAt(0)
            numList.add(temp)
            numList.toIntArray()
        }
        else ->{
            var temp = numbers[numbers.lastIndex]
            var numList = numbers.toMutableList()
            numList.removeAt(numList.lastIndex)
            numList.add(0,temp)
            numList.toIntArray()
        }

    }
}