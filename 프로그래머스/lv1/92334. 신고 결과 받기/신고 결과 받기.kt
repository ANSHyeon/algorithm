class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var result = IntArray(id_list.size) { 0 }
        var answer = IntArray(id_list.size) { 0 }
        var list = IntArray(id_list.size) { 0 }
        var temp = report.map { i -> i.split(" ") }.groupBy({ it.first() }, { it.last() })

        temp.values.forEach {
            for (i in 0..list.lastIndex) {
                list[i] = 0
            }
            it.forEach { name ->
                val index = id_list.indexOf(name)
                if (list[index] == 0) {
                    answer[index]++
                    list[index] = 1
                }
            }
        }
        val badManList = id_list.filterIndexed { i, it -> answer[i] >= k }

        
        id_list.forEachIndexed{i,it->
            badManList.forEach{ bad ->
                if (temp[it] != null && temp[it]!!.contains(bad)) {
                    result[i]++
                }
            }
        }  

        return result
    }
}