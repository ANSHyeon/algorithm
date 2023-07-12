fun main() {
    var num = readln().toInt()
    var index = 1
    while (num>1) {
        num -= 6 * index++
    }
    print(index)
}