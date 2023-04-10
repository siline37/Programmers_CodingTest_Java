class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 0;      //x값은 answer
        for(x=2; x<n; x++) {
            if((n-1)%x==0) {
                return x;
            }
        }
        x = answer;
        return answer;
    }
}