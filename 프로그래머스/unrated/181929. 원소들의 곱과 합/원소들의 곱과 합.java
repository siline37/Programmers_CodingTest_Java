class Solution {
    public int solution(int[] num_list) {
        //배열 원소의 합
        int plus = 0;
        for(int loop=0; loop<num_list.length; loop++) {
            plus += num_list[loop];
        }
        
        //배열 원소의 곱
        int multiple = 1;
        for(int loop=0; loop<num_list.length; loop++) {
            multiple *= num_list[loop];
        }
        
        int answer = 0;
        if((plus*plus) >= multiple) {
            answer = 1;
        }
        return answer;
    }
}