class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int [n];
        int index = 0;
        for(int loop=0; loop<n; loop++) {
            answer[index++] = num_list[loop];
        }
        return answer;
    }
}