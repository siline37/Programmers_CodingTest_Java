import java.util.*;

public class Solution {
    public int solution(int n) {
        //int > String > String 배열로 형 변환
        String number = Integer.toString(n);
        String array_number[] = number.split("");
        
        //배열에 담긴 요소를 int로 형 변환하여 더하기
        int answer = 0;
        for(int loop=0; loop<array_number.length; loop++) {
            answer += Integer.parseInt(array_number[loop]);
        }

        return answer;
    }
}