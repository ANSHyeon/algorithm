fun main() {

    val queue = mutableListOf<Int>()
    var count = 0

    fun push(x: Int) {
        queue.add(x)
        count++
    }

    fun pop(){
        if(count>0) {
            val re = queue.first()
            queue.removeAt(0)
            count--
            println(re)
        }
        else {
            println(-1)
        }
    }

    fun size(){
        println(count)
    }

    fun empty(){
        if(count>0) return println(0) else println(1)
    }

    fun front(){
        if(count>0) {
            println( queue.first())
        }
        else println(-1)
    }

    fun back(){
        if(count>0) {
            println( queue.last())
        }
        else println(-1)
    }


    val loopCount = readln().toInt()

    repeat(loopCount) {
        val str = readln()
        when(str.substring(0..2)) {
            "pus" -> {
                push(str.split(" ")[1].toInt())
            }
            "pop" -> pop()
            "siz" -> size()
            "emp" -> empty()
            "fro" -> front()
            "bac" -> back()
            else -> println(0)
        }
    }
}

