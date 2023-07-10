fun main() {
    val arr = IntArray(20000001)
    val count = readln().toInt()
    readln().split(" ").forEach {
        arr[it.toInt() + 10000000]++
    }
    readln()

    val sb = StringBuffer()
    readln().split(" ").forEach {
        sb.append("${arr[it.toInt()+10000000]} ")
    }
    print(sb.toString())
}