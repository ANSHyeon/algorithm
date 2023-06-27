import java.util.LinkedList
import java.util.Queue

fun main(args: Array<String>) {
    val totalCount = readln().toInt()
    repeat(totalCount){
        var (temp, position) = readln().split(" ").map{it.toInt()}
        val arr = readln().split(" ").map{it.toInt()}
        var answer = 1
        val queue:Queue<Int> = LinkedList()
        queue.addAll(arr)

        while(true) {
            val num = queue.peek()
            val isBest = queue.count { it > num } == 0
            if(isBest) {
                if(position==0) break
                else {
                    queue.remove()
                    answer++
                }
            }
            else {
                queue.remove()
                queue.add(num)
            }
            if(position > 0) position-- else position = queue.size-1
        }
        println(answer)
    }

}