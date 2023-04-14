import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        //String을 String 배열로 형 변환
        String array[] = my_string.split("");
        
        //인덱스 바꿀 문자를 담아두는 임시 변수
        String temp = "";
        temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
        
        //배열을 String으로 형 변환
        String answer = String.join("", array);
        return answer;
    }
}