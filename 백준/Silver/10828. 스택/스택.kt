class Stack {

}

fun main() {
    val capacity = readln().toInt()

    val stk = IntArray(capacity)
    var ptr = 0

    fun push(n: Int) {
        stk[ptr++] = n
    }

    fun pop() {
        if(ptr <= 0) {
            println("-1")
        } else {
            println(stk[--ptr])
        }
    }

    fun size() {
        println(ptr)
    }

    fun empty() {
        if(ptr <= 0) {
            println("1")
        } else {
            println("0")
        }
    }

    fun top() {
        if(ptr <= 0) {
            println("-1")
        } else {
            println(stk[ptr-1])
        }
    }

    for (i in 1..capacity) {
        var function = readln()
        when {
            function == "pop" -> {
                pop()
            }
            function == "size" -> {
                size()
            }
            function == "empty" -> {
                empty()
            }
            function == "top" -> {
                top()
            }
            function.substring(0,4) == "push" -> {
                val num = function.substring(5).toInt()
                push(num)
            }
        }
    }

}