fun main(){
    val (a,b) = readln().split(" ").map{it.toInt()}
    when{
        a>b -> {
            print(">")
        }
        a<b -> {
            print("<")
        }
        else -> {
            print("==")
        }
    }
}
