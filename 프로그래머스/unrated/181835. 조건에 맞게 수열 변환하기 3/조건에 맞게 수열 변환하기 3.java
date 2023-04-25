class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int index = 0;
        if(k%2 == 0) {
            for(int loop=0; loop<arr.length; loop++) {
                answer[index++] = arr[loop] + k;
            }
        }else {
            for(int loop=0; loop<arr.length; loop++) {
                answer[index++] = arr[loop] * k;
            }
        }
        return answer;
    }
}