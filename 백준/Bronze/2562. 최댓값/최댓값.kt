fun main(){

    var max = 0
    var count = 0
    for(i in 1..9){
        val num = readln().toInt()
        if(max<num){
            max = num
            count = i
        }
    }
    println(max)
    println(count)
}
