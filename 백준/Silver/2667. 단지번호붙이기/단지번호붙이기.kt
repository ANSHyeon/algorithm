fun main() {
    val n = readln().toInt()

    val graph = Array<IntArray>(n) { IntArray(n) }

    for (i in 0 until n) {
        graph[i] = readln().toCharArray().map { it.toString().toInt() }.toIntArray()
    }

    val visited = Array<BooleanArray>(n) { BooleanArray(n) }
    val list = mutableListOf<Int>()
    var count = 1

    for (x in 0 until n) {
        for (y in 0 until n) {
            val cnt = intArrayOf(0)
            if (bfs(graph, intArrayOf(x, y), visited, count, n, cnt)) {
                list.add(cnt[0])
                cnt[0] = 0
                count++
            }

        }
    }
    list.sort()
    println(count - 1)
    list.forEach {
        println(it)
    }
}


fun bfs(
    graph: Array<IntArray>,
    v: IntArray,
    visited: Array<BooleanArray>,
    count: Int,
    n: Int,
    cnt: IntArray
): Boolean {
    val x = v[0]
    val y = v[1]
    if (graph[x][y] == 0) return false
    if (visited[x][y]) return false
    visited[x][y] = true
    cnt[0]++
    graph[x][y] = count
    val dx = intArrayOf(-1, 1, 0, 0)
    val dy = intArrayOf(0, 0, -1, 1)

    for (i in 0..3) {
        val newX = x + dx[i]
        val newY = y + dy[i]

        if (newX < 0 || newY < 0 || newX >= n || newY >= n) {
            continue
        }
        bfs(graph, intArrayOf(newX, newY), visited, count, n, cnt)
    }
    return true
}