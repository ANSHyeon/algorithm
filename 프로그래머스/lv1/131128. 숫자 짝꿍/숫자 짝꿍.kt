class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = X.filter{Y.contains(it)}
        .groupBy{it}
        .map{if(it.value.size < Y.groupBy{it}[it.key]!!.size) it.value else Y.groupBy{it}[it.key]!!}
        .flatten()
        .sortedByDescending{it}
        .joinToString("")
        .let{it.ifEmpty{"-1"}}
        .let{i -> if(i.all {it ==  '0'}) "0" else i}
        return answer
    }
}