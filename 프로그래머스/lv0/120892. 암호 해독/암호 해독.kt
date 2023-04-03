class Solution {
    fun solution(cipher: String, code: Int): String {
        var str = StringBuilder("")
        for(i in 0 until cipher.length){
            if((i+1)%code == 0) str.append(cipher[i])
        }
        
        return str.toString()
    }
}