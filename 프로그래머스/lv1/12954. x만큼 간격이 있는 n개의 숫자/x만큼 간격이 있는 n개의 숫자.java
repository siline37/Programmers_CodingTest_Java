class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int loop=0; loop<n; loop++) {
            //(long)으로 형 변환 안하면 테스트 케이스 13, 14번에서 오류 발생
            answer[loop] = (long) x * (loop+1);
        }
        return answer;
    }
}