class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int index = 0;
        for(int loop=0; loop<answer.length; loop++) {
            answer[index++] = k * (loop+1);
        }
        return answer;
    }
}