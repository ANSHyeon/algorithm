import java.lang.StringBuilder

fun main() {
    val list = BooleanArray(1000001) { true }
    val primeList = mutableListOf<Int>()
    val map = mutableMapOf<Int, String>()
    val str = StringBuilder()
    list[0] = false
    list[1] = false
    for (i in 2 until 1000000) {
        if (list[i]) {
            primeList.add(i)
            for (j in i * 2..1000000 step i) {
                list[j] = false
            }
        }
    }
    primeList.removeAt(0)

    while (true) {
        val num = readln().toInt()
        if (num == 0) break

        if (map.containsKey(num)) {
            str.append(map[num])
            continue
        }

        for(it in primeList) {
            if(list[num-it]) {
                str.append("${num} = ${it} + ${num-it}\n")
                break
            }
        }
    }
    println(str.toString())
}
