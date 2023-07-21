fun main() {
    val num = readln().toInt()

    when (num) {
        1 -> {
            val tmp = readln().toLong()
            println(tmp * tmp)
        }

        else -> {
            val temp = readln().split(" ").map { it.toLong() }.sorted()
            println(temp.first() * temp.last())
        }
    }
}