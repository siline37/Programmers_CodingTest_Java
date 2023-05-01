class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        int index = 0;
        for(int loop=(n-1); loop<num_list.length; loop++) {
            answer[index++] = num_list[loop];
        }
        return answer;
    }
}