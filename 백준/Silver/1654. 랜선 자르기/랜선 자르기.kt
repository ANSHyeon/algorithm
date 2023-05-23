fun main(){
    val (now,want) = readln().split(" ").map{it.toLong()}
    var nowList = mutableListOf<Long>()

    for (i in 0 until now){
        nowList.add(readln().toLong())
    }

    var min: Long = 1
    var max = nowList.max()
    var answer: Long = 0
    while (min<=max){
        var count:Long = 0
        val mid = (min+max)/2
        nowList.forEach {
            count += it/mid
        }
        if (count<want){
            max = mid-1
        }
        else {
            min = mid+1
            answer = mid
        }
    }
    println(answer)
}