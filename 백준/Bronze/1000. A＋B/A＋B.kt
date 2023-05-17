fun main(args:Array<String>){
    val sum = readLine()!!.split(" ").sumOf{it.toInt()}
    print(sum)
}