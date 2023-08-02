import java.util.LinkedList
import java.util.Queue

fun main() {
    val (count, loop, v) = readln().split(" ").map { it.toInt() }
    val graph = Array(count + 1) { mutableListOf<Int>() }
    val selected1 = BooleanArray(count + 1) { false }
    val selected2 = BooleanArray(count + 1) { false }
    repeat(loop) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }
    graph.forEach {
        it.sort()
    }
    dfs(graph, v, selected1)
    println()
    bfs(graph, v, selected2)
}

fun dfs(graph: Array<MutableList<Int>>, v: Int, selected: BooleanArray) {
    selected[v] = true
    print("${v} ")
    for (i in graph[v]) {
        if (!selected[i]) {
            dfs(graph, i, selected)
        }
    }
}

fun bfs(graph: Array<MutableList<Int>>, v: Int, selected: BooleanArray) {
    val queue: Queue<Int> = LinkedList<Int>()
    selected[v] = true
    queue.add(v)
    while (queue.isNotEmpty()) {
        val a = queue.remove()
        print("${a} ")
        for (i in graph[a]) {
            if (!selected[i]) {
                queue.add(i)
                selected[i] = true
            }
        }
    }
}