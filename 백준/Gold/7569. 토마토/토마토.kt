import java.util.LinkedList
import java.util.Queue

fun main() {
    val (m, n, h) = readln().split(" ").map { it.toInt() }

    val graph = Array<IntArray>(h * n) { IntArray(m) }
    val visited = Array<BooleanArray>(h * n) { BooleanArray(m) { false } }
    val queue: Queue<IntArray> = LinkedList<IntArray>()
    var complete = 0
    var empty = 0
    var ready = 0

    for (i in 0 until h * n) {
        graph[i] = readln().split(" ").map { it.toInt() }.toIntArray()
    }

    for (i in 0 until h * n) {
        for (j in 0 until m) {
            if (graph[i][j] == 1) {
                visited[i][j] = true
                complete++
                queue.add(intArrayOf(i, j))
            } else if (graph[i][j] == -1) {
                empty++
            } else {
                ready++
            }
        }
    }
    if (complete + empty == h * m * n) {
        println(0)
    } else {
        var max = 1
        while (queue.isNotEmpty()) {
            val (x, y) = queue.poll()

            val dx = intArrayOf(n, -n, -1, 1, 0, 0)
            val dy = intArrayOf(0, 0, 0, 0, -1, 1)

            for (i in 0..5) {
                if (i == 2 && x % n == 0) {
                    continue
                }
                if (i == 3 && x % n == n - 1) {
                    continue
                }
                val newX = x + dx[i]
                val newY = y + dy[i]

                if (newX < 0 || newY < 0 || newX >= h * n || newY >= m) continue

                if (visited[newX][newY] == false && graph[newX][newY] == 0) {
                    val num = graph[x][y] + 1
                    max = maxOf(max, num)
                    graph[newX][newY] = num
                    complete++
                    ready--
                    visited[newX][newY] = true
                    queue.add(intArrayOf(newX, newY))
                }
            }
        }

        if (ready == 0) {
            println(max - 1)
        } else {
            println(-1)
        }
    }
}

