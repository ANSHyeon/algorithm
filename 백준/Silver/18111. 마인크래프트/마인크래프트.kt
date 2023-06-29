fun main() {
    val (n, m, b) = readln().split(" ").map{it.toInt()}
    val grounds = mutableListOf<Int>()

    for (i in 0 until n) {
        readln().split(" ").map{grounds.add(it.toInt())}
    }


    val maxHeight = grounds.maxOf { it }
    val minHeight = grounds.minOf { it }

    var time = 99999999
    var floor = 0



    outer@for(height in maxHeight downTo minHeight) {
        var inventory = b
        var tempTime = 0
        var deletBox = 0
        var createBox = 0
        for (num in grounds) {
            if (num > height) {
                deletBox += num - height
            } else if (num < height) {
                createBox += height - num
            }
        }
        if(inventory+deletBox-createBox < 0) continue
        tempTime = (deletBox *2) + createBox
        if (time>tempTime){
            time = tempTime
            floor = height
        }
    }

    print("${time} ${floor}")
}