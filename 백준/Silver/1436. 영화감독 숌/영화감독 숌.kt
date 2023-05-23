fun main(){
    val num = readln().toInt()
    var count = 0
    var devilNum = 665
    while(num!=count){
        devilNum++
        if(devilNum.toString().contains("666"))     count++

    }
    print(devilNum)
}