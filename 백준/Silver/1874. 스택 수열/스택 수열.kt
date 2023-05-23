import java.lang.StringBuilder
import java.util.LinkedList
import java.util.Stack

fun main(){
    val num = readln().toInt()
    var str = StringBuilder()
    var numQueue = LinkedList<Int>()

    var numStack = Stack<Int>()

    repeat(num){
        numQueue.add(readln().toInt())
    }

    for(i in 1..num){
        numStack.push(i)
        str.append("+\n")

        while(numStack.isNotEmpty() && numStack.peek()==numQueue.peek()){
            numStack.pop()
            numQueue.pop()
            str.append("-\n")
        }
    }
    if(numStack.size>0){
        print("NO")
    }else{
        print(str.toString())
    }


}