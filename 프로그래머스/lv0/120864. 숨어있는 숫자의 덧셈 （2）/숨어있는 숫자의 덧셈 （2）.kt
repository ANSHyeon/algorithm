class Solution {
    fun solution(my_string: String)=
        my_string.toCharArray().map{if(it in ('0'..'9')) it else "."}.joinToString("").split(".")
             .filter{it != ""}.sumOf{it.toInt()}
      
}