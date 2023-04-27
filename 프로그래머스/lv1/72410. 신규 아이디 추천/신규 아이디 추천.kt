class Solution {
    fun solution(new_id: String): String {
        
        var tempStr = new_id.toCharArray().map{
            if(it in ('A'..'Z'))it.toLowerCase() else it
        }.filter{
            it in ('a'..'z') || it in('0'..'9') || it == '-' || it == '_' || it == '.'
        }
        
        var sss = StringBuilder()
        
        if(tempStr[0]=='.'){
            sss.append(tempStr.joinToString("").substring(1).toCharArray().filterIndexed{
                 i,str -> !(str=='.' && tempStr[i]=='.')
             }.joinToString(""))
        }else{
            sss.append(tempStr[0] + tempStr.joinToString("").substring(1).toCharArray().filterIndexed{
                 i,str -> !(str=='.' && tempStr[i]=='.')
             }.joinToString(""))
        }
        if(sss.isNotEmpty() && sss[sss.lastIndex]=='.'){
                sss.deleteCharAt(sss.lastIndex)
            }
        if(sss.isEmpty()){
            sss.append("a")
        }
        if(sss.length>15){
            sss.delete(15,sss.lastIndex+1)
        }
        if(sss.isNotEmpty() && sss[sss.lastIndex]=='.'){
                sss.deleteCharAt(sss.lastIndex)
        }
        if(sss.length<3){
            for(i in 1..(3-sss.length)){
                sss.append(sss[sss.lastIndex])   
            }
        }
        var answer: String = sss.toString()
        return answer
    }
}