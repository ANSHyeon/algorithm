fun main() {
    while (true) {
        val input = readLine() ?: break
        val num = input.toInt()

        var count = 1
        var lastMod = 0
        while (true) {
            lastMod = ((lastMod * (10 % num)) % num + 1) % num
            if (lastMod == 0) {
                println(count)
                break
            }
            count++
        }
    }
}