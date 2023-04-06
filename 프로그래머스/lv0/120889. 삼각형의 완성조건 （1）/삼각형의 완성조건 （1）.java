class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int sum = 0;
        for(int loop=0; loop<sides.length; loop++) {
            if(max<sides[loop]) {
                max = sides[loop];
            }
            
            sum += sides[loop];
        }
        
        answer = (max<(sum-max)) ? 1:2;

        return answer;
    }
}