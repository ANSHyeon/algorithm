fun main() {
    val count = readln().toInt()
    val list = mutableListOf<List<Int>>()

    repeat(count) {
        list.add(readln().split(" ").map { it.toInt() })
    }

    list.forEach { inList ->
        val rank = list.count {
            inList[0] < it[0] && inList[1] < it[1]
        } + 1
        print("$rank ")
    }
}