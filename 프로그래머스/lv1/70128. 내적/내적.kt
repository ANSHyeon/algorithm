class Solution {
    fun solution(a: IntArray, b: IntArray) = a.mapIndexed{i,num -> num*b[i]}.sum()
}