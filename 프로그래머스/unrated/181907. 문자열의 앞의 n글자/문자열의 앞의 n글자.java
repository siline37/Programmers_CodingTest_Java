import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        //String > 배열에 담기
        String arr_string[] = my_string.split("");
        
        //n번째까지 배열 자르기
        arr_string = Arrays.copyOfRange(arr_string, 0, n);
        
        String answer = String.join("", arr_string);
        return answer;
    }
}