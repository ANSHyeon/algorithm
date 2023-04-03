class Solution {
    fun solution(my_string: String): Int{
        var str = my_string.filter{it in ('1'..'9')}
        var sum = 0
        for(i in str){
            sum = sum + i.toString().toInt()
        }
        return sum
    }
}