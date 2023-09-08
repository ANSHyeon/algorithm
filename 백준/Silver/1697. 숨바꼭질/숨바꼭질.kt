import java.util.LinkedList
import java.util.Queue

fun main() {
    val (now, want) = readln().split(" ").map { it.toInt() }
    if (now == want) {
        println(0)
        return
    }
    val visited = BooleanArray(999999) { false }
    val graph = IntArray(999999) { 0 }


    val queue: Queue<Int> = LinkedList<Int>()
    queue.add(now)
    visited[now] = true

    while (queue.isNotEmpty()) {
        val point = queue.poll()
        val move = intArrayOf(1, -1, point)

        for (i in 0..2) {
            val newPoint = point + move[i]
            if (newPoint < 0 || newPoint >= 999999) continue

            if (visited[newPoint] == false) {
                queue.add(newPoint)
                visited[newPoint] = true
                graph[newPoint] = graph[point] + 1
            }
        }
        if (graph[want] != 0) {
            println(graph[want])
            break
        }
    }
}