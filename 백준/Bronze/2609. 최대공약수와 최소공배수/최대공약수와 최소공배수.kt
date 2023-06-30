fun main() {

    fun gcd(a: Int, b: Int): Int {
        if (b == 0) {
            return a
        } else {
            return gcd(b, a % b)
        }
    }

    val (a, b) = readln().split(" ").map{it.toInt()}

    val gcdNum = gcd(a, b)
    println(gcdNum)
    println(a * b / gcdNum)

}