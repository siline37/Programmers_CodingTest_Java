class Solution {
    public int solution(int n) {
        //약수의 개수
        int count = 0;
        for(int loop=1; loop<=n; loop++) {
            if((n%loop) == 0) {
                count++;
            }
        }
        
        //약수 배열
        int submultiple[] = new int[count];
        int index = 0;
        for(int loop=1; loop<=n; loop++) {
            if((n%loop) == 0) {
                submultiple[index++] = loop;
            }
        }
        
        //약수의 합
        int answer = 0;
        for(int loop=0; loop<submultiple.length; loop++) {
            answer += submultiple[loop];
        }        
        return answer;
    }
}