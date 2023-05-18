fun main(){
    var numSet = mutableSetOf<Int>()

    repeat(10){
        val num = readln().toInt()
        numSet.add(num%42)
    }
    print(numSet.size)
}
