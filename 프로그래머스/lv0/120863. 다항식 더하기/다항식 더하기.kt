class Solution {
    fun solution(polynomial: String): String {
        var a = polynomial.split(" + ").filter{it.contains("x")}.map{if(it.replace("x","").equals("")){"1"}else{it.replace("x","")}}.sumOf{it.toInt()}
        
        var b = polynomial.split(" + ").filter{!it.contains("x")}.sumOf{it.toInt()}
        print(
            polynomial.split(" + ").filter{it.contains("x")}.map{if(it.replace("x","").equals("")){"1"}else{it.replace("x","")}}.sumOf{it.toInt()}
        )
        var answer: String = if(a==0){"${b}"}
        else if(a==1 && b==0) {"x"}
        else if(a==1) {"x + ${b}"}
        else if(b==0){"${a}x"}
        else {"${a}x + ${b}"}
        return answer
    }
}