fun main() {
    val firstNum = readln().toInt()
    val firstNums = readln().split(" ").map{it.toInt()}.sorted()
    val secondNum = readln().toInt()
    val secondNums = readln().split(" ").map{it.toInt()}

    secondNums.forEach { num->
        if(isIn(num,firstNums)) println("1")
        else println("0")
    }
}

fun isIn(num: Int, list: List<Int>): Boolean{
    if(list.size<1) return false

    var mid = list.size/2
    if(list[mid]<num){
        return isIn(num,list.subList(mid+1,list.lastIndex+1))
    }else if(list[mid]>num){
        return isIn(num,list.subList(0,mid))
    }else{
        return true
    }

}
