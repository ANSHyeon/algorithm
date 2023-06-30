fun main() {
    val (num, blackJack) = readln().split(" ").map { it.toInt() }

    val arr = readln().split(" ").map { it.toInt() }.toIntArray()

    var answer = 0
    for (i in 0..num-3) {
        for(j in i+1..num-2) {
            for(k in j+1..num-1) {
                val sum = arr[i] + arr[j] + arr[k]
                if(answer<sum && sum<=blackJack) answer=sum
            }
        }
    }
    print(answer)
}