import java.util.*;

class Solution {
    public String solution(String my_string) {
        //소문자화
        String lower = my_string.toLowerCase();
        
        //배열에 담아서 정렬
        String array_lower[] = lower.split("");
        Arrays.sort(array_lower);
            
        //String 배열을 String으로 형 변환
        String answer = String.join("", array_lower);
        return answer;
    }
}