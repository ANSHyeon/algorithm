class Solution {
    private var answer = 0 // 최종적으로 반환할 정답을 저장하는 변수

    // 주어진 피로도와 던전 정보를 이용하여 최대 던전 수를 찾는 함수
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        val visited = BooleanArray(dungeons.size) { false } // 각 던전의 탐험 여부를 나타내는 배열 초기화
        findAnswer(k, dungeons, visited, 0) // 최대 던전 수를 찾기 위한 재귀 함수 호출
        return answer // 최종적으로 찾은 최대 던전 수 반환
    }

    // 재귀 함수: 현재 피로도, 던전 정보, 탐험 여부, 현재까지의 던전 수를 매개변수로 받음
    fun findAnswer(k: Int, dungeons: Array<IntArray>, visited: BooleanArray, count: Int) {
        for (i in dungeons.indices) { // 모든 던전에 대해서 반복
            if (visited[i] == false && k >= dungeons[i][0]) { // 아직 탐험이 안된 던전이고 현재 피로도로 해당 던전을 탐험할 수 있는 경우
                visited[i] = true // 해당 던전을 탐험했다고 표시
                findAnswer(k - dungeons[i][1], dungeons, visited, count + 1) // 다음 던전을 탐험하기 위해 재귀 호출
                visited[i] = false // 탐험을 마치면 다시 해당 던전을 미탐험 상태로 변경
            }
        }

        if (count > answer) { // 현재까지의 던전 수가 기존 최대 던전 수보다 크다면
            answer = count // 최대 던전 수 업데이트
        }
    }
}