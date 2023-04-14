class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var failList = mutableListOf<Double>()
        var answer = mutableListOf<Int>()
        for(i in 1..N){
            if(stages.count{it>=i}==0) failList.add(0.0)
            else failList.add(stages.count{it==i}.toDouble()/stages.count{it>=i})
        }
        for(i in failList){
            var index = failList.indexOf(failList.maxOf{it})
            answer.add(index+1)
            failList[index] = -1.0
        }
        
        
        return answer.toIntArray()
    }
}