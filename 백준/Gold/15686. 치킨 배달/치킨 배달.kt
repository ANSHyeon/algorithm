import kotlin.math.abs
import kotlin.math.min

fun main() {
    val (N, M) = readln().split(' ').map { it.toInt() }

    val map = mutableListOf<List<Int>>()
    for (i in 0..<N) {
        map.add(readln().split(' ').map { it.toInt() })
    }

    val houseLocation = mutableListOf<IntArray>()
    val chickenLocation = mutableListOf<IntArray>()
    map.forEachIndexed { r, list ->
        list.forEachIndexed { c, num ->
            if (num == 1) {
                houseLocation.add(intArrayOf(r, c))
            } else if (num == 2) {
                chickenLocation.add(intArrayOf(r, c))
            }
        }
    }

    val distanceList = List(houseLocation.size) { mutableListOf<Int>() }
    houseLocation.forEachIndexed { index, houseLocation ->
        chickenLocation.forEach { chickenLocation ->
            val distance = abs(houseLocation[0] - chickenLocation[0]) + abs(houseLocation[1] - chickenLocation[1])
            distanceList[index].add(distance)
        }
    }
    var answer: Int = 999999
    val selected = mutableListOf<Int>()

    fun sol(
        count: Int,
        removeCount: Int,
        begin: Int
    ) {
        if (count == removeCount) {
            val dis = distanceList.sumOf { list ->
                list.filterIndexed { index, _ ->
                    index !in selected
                }.min()
            }
            answer = min(answer, dis)
            return
        }
        for (i in begin..<chickenLocation.size) {
            selected.add(i)
            sol(count + 1, removeCount, i + 1)
            selected.removeAt(selected.lastIndex)
        }
    }

    sol(0, chickenLocation.size - M, 0)
    print(answer)
}
