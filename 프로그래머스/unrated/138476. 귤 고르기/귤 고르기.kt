class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val set = tangerine.toSet()
        var arr = Array(tangerine.maxOf{it}+1){0}
        set.forEach{ num ->
            arr[num] = tangerine.count{num==it}
        }
        var a = arr.sorted().reversed()
        
        var temp = 0
        var answer = 0
        while(temp<k){
            temp += a[answer]
            answer++
        }
        
        
        return answer
    }
}