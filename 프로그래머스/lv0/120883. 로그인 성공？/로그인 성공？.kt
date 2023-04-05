class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>) =
        when{
            db.filter{it[0].equals(id_pw[0]) && it[1].equals(id_pw[1])}.size>0 -> "login"
            
            db.filter{it[0].equals(id_pw[0])}.size>0 -> "wrong pw"
            
            else -> "fail"
        }
}