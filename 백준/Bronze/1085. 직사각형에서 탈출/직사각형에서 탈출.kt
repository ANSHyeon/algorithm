fun main(){
    val (x,y,w,h) = readln().split(" ").map{it.toInt()}

    var min = x

    if(w-x < min) min = w-x
    if(y < min) min = y
    if(h-y < min) min = h-y

    print(min)


}