fun main(){
    val repea = readln().toInt()

    repeat(repea) {
        var num = 1
        var sum = 0

        var temp = readln()
        var arr = temp.toMutableList()
        arr.add(0, 'X')


        temp.mapIndexed { i, it ->
            if (arr[i] == 'O' && temp[i] == 'O') {
                ++num
            }else if(temp[i] == 'O'){
                num = 1
                num
            }

            else {
                num = 1
                0
            }
        }.forEach {
            sum += it
        }
    println(sum)
    }

}
