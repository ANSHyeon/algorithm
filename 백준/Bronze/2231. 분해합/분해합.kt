fun main() {
    val num = readln().toInt()

    var answer = 0
    for (i in num downTo 1) {
        val temp = i + i.toString().sumOf { it.toString().toInt() }
        if (temp == num) {
            answer = i
        }
    }
    println(answer)
}