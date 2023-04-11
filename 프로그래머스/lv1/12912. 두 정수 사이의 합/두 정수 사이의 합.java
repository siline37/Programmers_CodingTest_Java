class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b) {
            answer = a;
        }else {
            if(a < b) {
                for(int loop=a; loop<=b; loop++) {
                    answer += loop;
                }
            }else {
                for(int loop=b; loop<=a; loop++) {
                    answer += loop;
                }
            }
        }
        return answer;
    }
}