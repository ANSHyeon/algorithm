class Solution {
    fun solution(s: String): Int {
        var strList = s.split(" ").filterIndexed{i, _  ->(s+" 0").split(" ")[i+1] != "Z" }.filter{it != "Z"}.toList()
        println(strList)
        var sum = 0
        for(i in strList){
            sum+=i.toInt()
        }
        var answer: Int = sum
        return answer
    }
}