import java.util.LinkedList
import java.util.Queue

fun main() {
    val queue: Queue<Int> = LinkedList<Int>()

    val lastNum = readln().toInt()

    for(i in 1..lastNum) {
        queue.add(i)
    }

    while (queue.size > 1) {
        queue.poll()
        val temp = queue.peek()
        queue.poll()
        queue.add(temp)
    }
    print(queue.poll())
}