class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answera = mutableListOf<String>()
        for(str in quiz){
            if(
                str.split(" = ")[0].toString().replace("- -","").replace("- ","-").replace("+ ","").split(" ").sumOf{it.toInt()}
                ==str.split(" = ")[1].toInt()
            ) answera.add("O")
            else answera.add("X")
        }
        return answera.toTypedArray()
    }
}