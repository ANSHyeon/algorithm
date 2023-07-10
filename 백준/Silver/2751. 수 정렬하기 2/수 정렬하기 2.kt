fun main() {
    val count = readln().toInt()
    val arr = BooleanArray(2000001)

    repeat(count){
        arr[readln().toInt()+1000000] = true
    }
    val sb =StringBuffer()
    arr.forEachIndexed { idx, bool ->
        if (bool==true) sb.append("${idx-1000000}\n")
    }
    print(sb.toString())
}