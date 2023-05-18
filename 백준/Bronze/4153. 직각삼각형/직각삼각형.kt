fun main(){
    while(true) {
        val (a, b, c) = readln().split(" ").map { it.toInt() }
        if(a == 0 && b==0 && c==0) break
        
        when {
            (a * a) + (b * b) == (c * c) -> println("right")
            (a * a) + (c * c) == (b * b) -> println("right")
            (c * c) + (b * b) == (a * a) -> println("right")
            else -> println("wrong")

        }
    }
}