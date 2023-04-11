class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        val comparator: Comparator<String> = compareBy{it[n]}
        var answer = strings.sortedWith(comparator.thenBy{it}).toTypedArray()
        return answer
    }
}