class Solution {
    fun solution(s: String): String {
        val result = StringBuilder()
        val strArr = s.toLowerCase().split("")
        var isFirst = true
    
        
        strArr.forEach{
            
            if(isFirst == true){
                result.append(it.toUpperCase())
                isFirst = false
            }
            
            else{
                result.append(it)
            }
            
            if(it == " " || it == "") isFirst = true
        }
        
        
        
      
        return result.toString()
    }
}