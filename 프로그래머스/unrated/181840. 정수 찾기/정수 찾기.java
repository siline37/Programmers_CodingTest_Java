class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int loop=0; loop<num_list.length; loop++) {
            if(num_list[loop] == n) {
                answer = 1;
            }
        }
        return answer;
    }
}