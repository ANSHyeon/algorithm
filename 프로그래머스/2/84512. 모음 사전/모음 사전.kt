class Solution {
    fun solution(word: String):Int{
        var result = 0
        val map = mapOf(
            'A' to 1,
            'E' to 2,
            'I' to 3,
            'O' to 4,
            'U' to 5,
        )
        val a = StringBuilder()
        word.forEach{
            a.append(map[it])
        }
        val want = a.toString()
        var answer = 0
        println(want)
        for(i in 1..5) {
            for (j in 0..5) {
                if(j == 0) {
                    answer++
                    if("$i"==want) {
                        result= answer
                    }
                    continue
                }
                for(k in 0..5){
                    if(k == 0) {
                        answer++
                        if("$i$j"==want) {
                            result= answer
                        }
                        continue
                    }
                    for(l in 0..5) {
                        if(l == 0) {
                            answer++
                            if("$i$j$k"==want) {
                                result= answer
                            }
                            continue
                        }
                        for(m in 0..5){
                            answer++
                            if (m == 0) {
                                if("$i$j$k$l"==want) {
                                    result= answer
                                }
                            } else if("$i$j$k$l$m"==want) {
                                result= answer
                            }
                        }
                    }
                }
            }
        }
        return result
    }
}