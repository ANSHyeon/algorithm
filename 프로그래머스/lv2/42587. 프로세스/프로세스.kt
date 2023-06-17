import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        val queue: Queue<Int> = LinkedList<Int>()
        var position = location
        
        var answer = 0
        
        priorities.forEach{
            queue.add(it)
        }
        
        while(true){
           val num = queue.remove()
           if(queue.count{it>num}>0){
               queue.add(num)
               if(position==0){
                   position = queue.size-1
               }
               else{
                   position--
               }
           }
           else{
               answer++
               if(position==0){
                   break
               }
               else{
                   position--
               }
           }
        }
        return answer
    }
}