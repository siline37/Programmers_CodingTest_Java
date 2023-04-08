class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")) {
            answer[0] = numbers[numbers.length-1];
            int index = 1;
            for(int loop=1; loop<numbers.length; loop++) {
                answer[index++] = numbers[loop-1];
            }
        }else {
            answer[numbers.length-1] = numbers[0];
            int index = 0;
            for(int loop=0; loop<numbers.length-1; loop++) {
                answer[index++] = numbers[loop+1];
            }
        }
        return answer;
    }
}