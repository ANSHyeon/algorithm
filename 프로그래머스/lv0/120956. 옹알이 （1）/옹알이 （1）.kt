class Solution {
    fun solution(babbling: Array<String>): Int {
    var count =0
    for(i in babbling){
        var str = i.replace("aya",".").replace("ye",".").replace("woo",".").replace("ma",".").replace(".","")
        println(str)
        if(str.length == 0){
            count++
        }
    }
    return count
}
}