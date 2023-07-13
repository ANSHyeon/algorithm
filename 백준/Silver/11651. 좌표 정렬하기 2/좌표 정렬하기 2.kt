fun main() {
    val count = readln().toInt()
    val list = mutableListOf<List<Int>>()

    repeat(count) {
        list.add(readln().split(" ").map { it.toInt() })
    }

    val compare = compareBy<List<Int>> { it[1] }.thenBy { it[0] }
    list.sortWith(compare)
    list.forEach {
        println("${it[0]} ${it[1]}")
    }
}