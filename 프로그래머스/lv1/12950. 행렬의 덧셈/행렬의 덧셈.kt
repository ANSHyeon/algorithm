class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>) = arr1.mapIndexed{i,arr -> arr.mapIndexed{j,num -> num+arr2[i][j]}}
}