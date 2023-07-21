fun main() {
    var num = readln().toInt()
    var sum = 0L
    for(i in 1..num) {
        sum+=i*(num/i)
    }
    println(sum)
}