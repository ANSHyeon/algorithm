fun main() {
    val count = readln().toInt()

    val list = mutableListOf<String>()
    for (i in 0 until count) {
        list.add(readln())
    }
    list.sortBy { it.split(" ").first().toInt() }
    list.forEach {
        println(it)
    }
}