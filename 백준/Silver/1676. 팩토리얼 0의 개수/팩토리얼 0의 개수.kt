fun main() {
    val num = readln().toInt()
    var temp: Long = 1L
    var counter = 0
    for(i in 1..num){
        temp*=i
        while(temp.toString().last() == '0'){
            counter++
            temp /= 10
            if(temp>1000000) {
                temp = temp.toString().substring((temp.toString().length-4)).toLong()
            }
        }
    }
    print(counter)


}