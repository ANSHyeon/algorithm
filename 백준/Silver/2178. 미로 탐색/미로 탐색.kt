import sun.awt.image.ImageWatched.Link
import java.util.LinkedList
import java.util.Queue

fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }

    val map = Array<IntArray>(a) { IntArray(b) { 0 } }
    for (i in 0 until a) {
        map[i] = readln().toCharArray().map { it.toString().toInt() }.toIntArray()
    }
    bfs(map, a, b)
    println(map[a-1][b-1])
}

fun bfs(map: Array<IntArray>, a: Int, b: Int) {
    val queue: Queue<IntArray> = LinkedList<IntArray>()
    queue.add(intArrayOf(0, 0))

    val dx = intArrayOf(0, 0, -1, 1)
    val dy = intArrayOf(1, -1, 0, 0)
    while (queue.isNotEmpty()) {
        val dots = queue.poll()
        for (i in 0..3) {
            val x = dots[0] + dx[i]
            val y = dots[1] + dy[i]
            if (x < 0 || y < 0 || x >= a || y >= b) {
                continue
            }
            if (map[x][y] == 1) {
                queue.add(intArrayOf(x, y))
                map[x][y] = map[dots[0]][dots[1]] + 1
            }
        }
    }
}