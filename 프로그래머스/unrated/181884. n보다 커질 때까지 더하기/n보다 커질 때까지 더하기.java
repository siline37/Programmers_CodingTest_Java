class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int loop=0; loop<numbers.length; loop++) {
            answer += numbers[loop];
            if(answer > n) {
                break;
            }
        }
        return answer;
    }
}