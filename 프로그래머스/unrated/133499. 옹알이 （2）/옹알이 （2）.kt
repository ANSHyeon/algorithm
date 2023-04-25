class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = babbling.count{isSpeak(it)}
        return answer
    }
    fun isSpeak(str:String): Boolean {
        val resultStr = str.replace("ayaaya",",")
        .replace("yeye",",")
        .replace("woowoo",",")
        .replace("mama",",")
        .replace("aya",".")
        .replace("ye",".")
        .replace("woo",".")
        .replace("ma",".")
        
        if(resultStr.replace(".","").length==0) return true
        else return false
    }
}