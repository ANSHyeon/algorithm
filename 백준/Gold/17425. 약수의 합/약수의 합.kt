import java.lang.StringBuilder

fun main() {
    var time = readln().toInt()
    val list = LongArray(1000001) { 1L }
    for (i in 2..1000000) {
        for (j in i..1000000 step i) {
            list[j] += i.toLong()
        }
    }
    for (i in 2..1000000) {
        list[i] += list[i - 1]
    }
    val str = StringBuilder()
    repeat(time) {
        str.append("${list[readln().toInt()]}\n")
    }
    println(str.toString())
}