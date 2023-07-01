fun main() {
    val num = readln().toInt()

    outer@for (i in 0 until num) {
        var str = readln()
        if (str.length%2 == 0) {
           for(j in 0 until str.length/2) {
               str = str.replace("()","")
               if(str.length==0) {
                   println("YES")
                   continue@outer
               }
           }
        }
        println("NO")
    }
}