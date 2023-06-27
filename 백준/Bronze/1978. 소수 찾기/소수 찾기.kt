import kotlin.math.sqrt

fun main(args: Array<String>) {
    val count = readln().toInt()
    val arr = readln().split(" ").map{it.toInt()}
    var answer = 0

    for(i in 0 until count) {
        if(isprimeNumber(arr[i])) answer++
    }
    print(answer)
}

fun isprimeNumber(num: Int): Boolean {
    val mid = sqrt(num.toDouble()).toInt()+1
    if(num == 2) return true
    else if(num == 1 || num%2 == 0) return false

    for(i in 3..mid step 2){
        if(num%i==0) return false
    }
    return true
}
