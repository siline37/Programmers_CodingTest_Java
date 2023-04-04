class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int loop=0; loop<num_list.length; loop++) {
            answer[loop] = num_list[num_list.length-loop-1];        
        }
        return answer;
    }
}