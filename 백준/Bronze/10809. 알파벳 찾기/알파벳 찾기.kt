fun main(){

    var arr = Array<Int>(26){-1}

    val strArray = readln().toCharArray()

    for(i in 0..25){
        arr[i] = strArray.indexOf((i+97).toChar())
    }
    arr.forEach {
        print(it)
        print(" ")
    }
}
