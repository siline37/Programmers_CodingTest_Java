class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        for(int loop=0; loop<t; loop++) {
            answer += n * ((int) Math.pow(2, loop));
        }
        answer += n;
        return answer;
    }
}