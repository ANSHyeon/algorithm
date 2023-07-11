fun main() {
    val (total, range) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(total+1) { 1 }
    var answer = mutableListOf<Int>()
    var count = 0
    var temp = 0
    while (count<total) {
        repeat(range){
            temp++
            if(temp>total) temp=1
            while (arr[temp]==0){
                temp++
                if(temp>total) temp = 1
            }
        }
        arr[temp]=0
        count++
        answer.add(temp)
    }
    print(answer.joinToString (", ","<",">" ))
}

