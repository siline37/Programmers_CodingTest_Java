class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start +1];
        int index = 0;
        for(int i=0; i<answer.length; i++) {
            answer[index++] = start++;
        }
        return answer;
    }
}