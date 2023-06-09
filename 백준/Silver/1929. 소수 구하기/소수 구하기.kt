import kotlin.math.sqrt

fun main() {
    val (a, b) = readln().split(" ").map{it.toInt()}

    for(i in a..b){
        if(i==1){
            continue
        }
        if(i==2) {
            println(i)
            continue
        }
        if(isPrime(i)) println(i)
    }
}

fun isPrime(num: Int): Boolean {
    var temp = num
    val root = sqrt(num.toDouble()).toInt()
    if(temp%2 == 0) return false
    for(i in 3..root step 2){
        if(temp%i==0) return false
    }
    return true

}
