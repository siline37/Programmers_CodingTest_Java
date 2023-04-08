class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0,0};
        int max = array[0];
        for(int loop=0; loop<array.length; loop++) {
            if(max < array[loop]) {
                max = array[loop];
                answer[0] = max;
                answer[1] = loop;
            }
        }        
        return answer;
    }
}