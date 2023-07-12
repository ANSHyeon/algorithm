import kotlin.math.roundToInt

fun main() {
    val count = readln().toInt()
    val arr = IntArray(count)
    var sum = 0
    var map = mutableMapOf<Int, Int>()

    for (i in 0 until count) {
        arr[i] = readln().toInt()
        sum += arr[i]
        map[arr[i]] = map.getOrDefault(arr[i], 0) + 1
    }

    arr.sort()
    val average = (sum.toDouble() / count).roundToInt()
    val mid = arr[count / 2]
    val highest = arr.groupBy { it }.toList().sortedByDescending { it.second.size }
    val a =
        if (highest.size > 1 && highest[0].second.size == highest[1].second.size) highest[1].first else highest[0].first
    println(average)
    println(mid)
    println(a)
    println(arr[arr.lastIndex] - arr[0])
}

