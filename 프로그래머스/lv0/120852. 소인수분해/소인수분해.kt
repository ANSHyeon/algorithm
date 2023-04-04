import kotlin.math.*

class Solution {
    fun solution(n: Int): IntArray {
        var numList = mutableListOf<Int>()
        var arr = Array(n+1, {false})
        arr[0] = true; arr[1] = true;
        
        for(i in 2.. Math.sqrt(n+1.toDouble()).toInt()) {
        if(arr[i] == true) {
            continue;
        }

        for(j in i*i..n step +i) {
            arr[j] = true;
        }
    }

    for(i in 1..n) {
        if(arr[i] == false) {
            numList.add(i)
        }
    }
    
        
        var answer: IntArray = numList.toIntArray().filter{n%it==0}.toIntArray()
        return answer
    }
}