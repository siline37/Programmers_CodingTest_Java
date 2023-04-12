class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int loop=0; loop<a.length; loop++) {
            answer += (a[loop] * b[loop]);
        }        
        return answer;
    }
}