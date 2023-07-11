import java.util.LinkedList

fun main() {

    val deque:LinkedList<Int> = LinkedList()

    val loopCount = readln().toInt()

    repeat(loopCount) {
        val str = readln()
        when (str){
            "size" -> println(deque.size)
            "empty" -> if(deque.size>0) println(0) else println(1)
            "front" -> if(deque.size>0) println(deque.first()) else println(-1)
            "back" -> if(deque.size>0) println(deque.last()) else println(-1)

            "pop_front" -> if(deque.size>0) println(deque.removeFirst()) else println(-1)
            "pop_back" -> if(deque.size>0) println(deque.removeLast()) else println(-1)
            else -> {
                if(str.startsWith("push_front")){
                    deque.addFirst(str.split(" ")[1].toInt())
                }else {
                    deque.addLast(str.split(" ")[1].toInt())
                }
            }
        }
    }
}

