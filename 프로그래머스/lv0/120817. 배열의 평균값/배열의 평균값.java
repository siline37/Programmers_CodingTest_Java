class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for(int loop=0; loop<numbers.length; loop++) {
            sum += numbers[loop];
        }        
        answer = sum / numbers.length;
        return answer;
    }
}