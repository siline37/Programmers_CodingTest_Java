class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int arrAdd = 0;
        for(int loop=0; loop<arr.length; loop++) {
            arrAdd += arr[loop];
        }        
        answer = (double) arrAdd/arr.length;
        return answer;
    }
}