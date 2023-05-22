import kotlin.math.min

fun main(){
    val (line, length) = readln().split(" ").map{it.toInt()}
    val wStartArray = arrayOf("WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW")
    val bStartArray = arrayOf("BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB")
    val inputArray = Array<String>(line){""}
    var w = 0
    var b = 0
    var min = 9999999
    for(i in 0 until line){
        inputArray[i] = readln()
    }

    for(i in 0..(line-8)){

        for(j in 0..(length-8)){

            for(k in 0..7){
                w+= inputArray[i+k].substring(j..j+7).filterIndexed { i, it ->
                    it != wStartArray[k][i]
                }.length
                b+= inputArray[i+k].substring(j..j+7).filterIndexed { i, it ->
                    it != bStartArray[k][i]
                }.length
            }
            if(min> min(w,b)) min = min(w,b)
            w=0
            b=0
        }
    }
    print(min)
}