fun main(){
    var calculate = readln().toInt()
    repeat(2){
        calculate = calculate * readln().toInt()
    }
    for(i in 0..9){
        println(calculate.toString().count{
            it.toString() == i.toString()
        })
    }

}
