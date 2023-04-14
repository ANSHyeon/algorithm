class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var newCards1 = cards1.toMutableList()
        var newCards2 = cards2.toMutableList()
        
        var answer: String = "Yes"
        for(string in goal){
            if(newCards1.size > 0 && newCards1[0].equals(string)) newCards1.removeAt(0)
            else if(newCards2.size > 0 && newCards2[0].equals(string)) newCards2.removeAt(0)
            else answer = "No"
        }
        return answer
    }
}