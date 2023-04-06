class Solution {
    public int[] solution(int[] numbers) {
        //numbers의 길이만큼 배열 초기화 필요
        int[] answer = new int[numbers.length];              
        for(int loop=0; loop<numbers.length; loop++) {
            answer[loop] = 2 * numbers[loop];
        }
        return answer;
    }
}