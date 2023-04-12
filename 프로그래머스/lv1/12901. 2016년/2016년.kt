class Solution {
    fun solution(a: Int, b: Int): String {
        var week = arrayOf<String>("FRI","SAT","SUN","MON","TUE","WED","THU")
        var date = mapOf(
            0 to "0",
            1 to "31",
            2 to "60",
            3 to "91",
            4 to "121",
            5 to "152",
            6 to "182",
            7 to "213",
            8 to "244",
            9 to "274",
            10 to "305",
            11 to "335",
        )
        var num = (date.get(a-1)!!.toInt() + b-1)%7
        
        var answer = if(num>6)  week[num-7] else week[num]
        return answer
    }
}