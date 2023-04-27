class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length >= 11) {
            for(int loop=0; loop<num_list.length; loop++) {
                answer += num_list[loop];
            }
        }else {
            answer = 1;
            for(int loop=0; loop<num_list.length; loop++) {
                answer *= num_list[loop];
            }
        }
        return answer;
    }
}