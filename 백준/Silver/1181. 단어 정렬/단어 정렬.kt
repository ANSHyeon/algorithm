fun main(){
    val num = readln().toInt()
    var strList = mutableSetOf<String>()
    repeat(num){
        strList.add(readln())
    }
    val strComparator = compareBy<String>{it.length}.thenBy { it }
    strList.sortedWith(strComparator).forEach {
        println(it)
    }
}