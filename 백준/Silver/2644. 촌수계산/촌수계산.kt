import java.util.LinkedList
import java.util.Queue

fun main() {
    val totalPerson = readln().toInt()
    val (start, want) = readln().split(" ").map { it.toInt() }

    val repeat = readln().toInt()

    val graph = Array<MutableList<Int>>(totalPerson + 1) { mutableListOf() }
    val chonesu = Array(totalPerson + 1) { -1 }

    repeat(repeat) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    bfs(graph, start, chonesu)
    println(chonesu[want])
}

fun bfs(graph: Array<MutableList<Int>>, v: Int, chonesu: Array<Int>) {
    val queue: Queue<Int> = LinkedList<Int>()
    queue.add(v)
    chonesu[v] = 0

    while (queue.isNotEmpty()) {
        val queueData = queue.poll()
        for (i in graph[queueData]) {
            if (chonesu[i] == -1) {
                queue.add(i)
                chonesu[i] = chonesu[queueData] + 1
            }
        }
    }
}