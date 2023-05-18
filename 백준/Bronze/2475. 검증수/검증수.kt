fun main(){
    val numList = readln().split(" ").map{it.toInt()}
    var sum = 0
    numList.forEach {
        sum += it*it
    }
    print(sum%10)
}
