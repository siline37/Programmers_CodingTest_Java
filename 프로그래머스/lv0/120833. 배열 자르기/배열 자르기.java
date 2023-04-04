import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        //Arrays.copyOfRange(원본 배열, 시작 위치-포함, 마지막 위치-포함X)
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }
}