class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var list = mutableListOf<Int>()
        
        for(i in left+1..right+1){
            val share = (i/n +1).toInt()
            val remainder = (i%n).toInt()
            if(share == 1){
                list.add(remainder)
                continue
            }
            else if(remainder == 0){
                list.add(n)
                continue
            }else if(share>=remainder) {
                list.add(share)
            }
            else{
                list.add(remainder)
            }
            
        }
    
        var answer: IntArray = list.toIntArray()
        return answer
    }
}