class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var result = (1..count).map{i->i*price}.sumOf{it.toLong()}-money.toLong()
        
        
        var answer: Long = if(result>0) result else 0.toLong()
        return answer
    }
}