class Solution {
    fun solution(food: IntArray): String {
        var str = StringBuilder()
        for((i,num) in food.withIndex()){
            str.append(i.toString().repeat(num/2))
        }
        var answer: String = str.toString()+"0"+str.toString().reversed()
        return answer
    }
}