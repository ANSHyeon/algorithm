fun main() {

    fun factorial(num: Int): Int {
        if (num<=1) {
            return 1
        } else {
            return num * factorial(num-1)
        }
    }

    val (n, r) = readln().split(" ").map{it.toInt()}
    
    print(factorial(n) / (factorial(r) * factorial(n-r)))

}