class Solution {
    fun solution(n: Int): IntArray {
        var numSet = mutableSetOf<Int>()
        var i = 2
        var num = n
        while(num>1){
            if(num%i==0){
                numSet.add(i)
                num = num/i
            }
            else {i=i+1}
        }
        return numSet.toIntArray()
    }
}