class Solution {
    public int[] solution(int money) {
        int max = 0;
        int rest = 0;        
        max = money / 5500;
        rest = money - (5500*max);        
        int[] answer = {max, rest};
        return answer;
    }
}