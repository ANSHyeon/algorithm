class Solution {
    fun solution(spell: Array<String>, dic: Array<String>)=if(dic.filter{i-> i.toCharArray().filter { it.toString() in spell }.size == i.length}.filter { j -> j.toCharArray().distinct().size == j.length }.filter { k -> k.length == spell.size }.size==0) 2
        else 1
}