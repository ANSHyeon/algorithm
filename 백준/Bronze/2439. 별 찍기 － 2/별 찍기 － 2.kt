fun main(){
    val num = readln().toInt()
    for(i in 1..num){
        print(" ".repeat(num-i))
        println("*".repeat(i))
    }
}
