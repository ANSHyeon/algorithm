class Solution {
    fun solution(answers: IntArray): IntArray {
        var noMath_1 = mutableListOf<Int>()
        var noMath_2 = mutableListOf<Int>()
        var noMath_3 = mutableListOf<Int>()
        var result = mutableListOf<Int>()
        var temp = mutableListOf<Int>()
        for(i in 1..answers.size){
            when(i%5){
                1 -> noMath_1.add(1)
                2 -> noMath_1.add(2)
                3 -> noMath_1.add(3)
                4 -> noMath_1.add(4)
                0 -> noMath_1.add(5)
            }
            when(i%8){
                1, 3, 5, 7 -> noMath_2.add(2)
                2 -> noMath_2.add(1)
                4 -> noMath_2.add(3)
                6 -> noMath_2.add(4)
                0 -> noMath_2.add(5)
            }
            when(i%10){
                1, 2 -> noMath_3.add(3)
                3, 4 -> noMath_3.add(1)
                5, 6 -> noMath_3.add(2)
                7, 8 -> noMath_3.add(4)
                9, 0 -> noMath_3.add(5)
            }
        }
        result.add(answers.filterIndexed{i,num -> num==noMath_1[i]}.size)
        result.add(answers.filterIndexed{i,num -> num==noMath_2[i]}.size)
        result.add(answers.filterIndexed{i,num -> num==noMath_3[i]}.size)
        for(i in 0..2){
            if(result[i]==result.maxOf{it}) temp.add(i+1)
        }
        var answer = temp.toIntArray()
        return answer
    }
}