fun main() {
    val count = readln().toInt()
    val loop = readln().toInt()

    val graph = Array<MutableList<Int>>(count + 1) { mutableListOf() }
    val checked = BooleanArray(count + 1) { false }
    repeat(loop) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    print(dfs(graph, 1, checked)-1)
}

fun dfs(graph: Array<MutableList<Int>>, v: Int, checked: BooleanArray): Int {
    var sum = 0
    checked[v] = true
    sum++
    for (i in graph[v]) {
        if (!checked[i]) {
            sum += dfs(graph, i, checked)
        }
    }
    return sum
}