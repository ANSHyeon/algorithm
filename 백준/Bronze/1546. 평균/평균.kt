fun main(){
    val num = readln().toInt()
    var sum = 0.0
    val str = readln().split(" ").map{it.toDouble()}
    str.forEach{
            sum += it*100/str.max()
        }
    print(sum/num)
}
