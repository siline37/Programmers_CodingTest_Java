class Solution {
    public int[] solution(int[] num_list) {
        int even = 0;   //짝수
        int odd = 0;    //홀수
        int[] answer = {even, odd};
        for(int loop=0; loop<num_list.length; loop++) {
            if(num_list[loop]%2 == 0) {
                even++;
            }else {
                odd++;
            }
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}