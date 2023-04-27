class Solution {
    fun solution(s: String, skip: String, index: Int): String {  
        
        var answer: String = s.toCharArray().map{
            var temp = it.toInt()
            repeat(index){
                temp++
                if(temp>122) temp-=26
                while(temp.toChar() in skip.toCharArray()){
                    temp++
                    if(temp>122) temp-=26
                }
            }
            temp.toChar()
        }.joinToString("")
        
        return answer
    }
    
    fun makeA(num: Int): Char{
        if(num>122) return (num-((((num-122)/26)+1)*26)).toChar()
        return num.toChar()
    }
}