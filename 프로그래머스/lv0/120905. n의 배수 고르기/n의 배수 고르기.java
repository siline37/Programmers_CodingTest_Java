class Solution {
    public int[] solution(int n, int[] numlist) {
        //배열 초기화
        int count = 0;
        for(int loop=0; loop<numlist.length; loop++) {
            if(numlist[loop]%n==0) {
                count++;
            }
        }
        int[] answer = new int[count];

        //n의 배수 고르기
        count = 0;
        for(int loop=0; loop<numlist.length; loop++) {
            if(numlist[loop]%n==0) {
                answer[count++] = numlist[loop];
            }
        }
        return answer;
    }
}