class Solution {
    public int solution(int n) {
        //제곱수이면 약수의 개수가 홀수
        int count = 0;
        for(int loop=1; loop<=n; loop++) {
            if((n%loop) == 0) {
                count++;
            }
        }
        
        int answer = (count%2 == 0) ? 2 : 1;        
        return answer;
    }
}