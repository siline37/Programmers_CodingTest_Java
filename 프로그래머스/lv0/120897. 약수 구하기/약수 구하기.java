class Solution {
    public int[] solution(int n) {
        //약수의 개수
        int count = 0;
        for(int loop=1; loop<=n; loop++) {
            if((n%loop) == 0) {
                count++;
            }
        }
        
        //약수 구하기
        int[] answer = new int[count];
        int index = 0;
        for(int loop=1; loop<=n; loop++) {
            if((n%loop) == 0) {
                answer[index++] = loop;
            }
        }
        return answer;
    }
}