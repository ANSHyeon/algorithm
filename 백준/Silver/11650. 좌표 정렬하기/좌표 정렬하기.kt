fun main() {
    val num = readln().toInt()

    val positionList = mutableListOf<List<Int>>()
    for (i in 0 until num) {
        positionList.add(readln().split(" ").map{it.toInt()})
    }
    positionList.sortWith(compareBy<List<Int>> {it[0]}.thenBy { it[1] })
    positionList.forEach {
        println("${it[0]} ${it[1]}")
    }
}