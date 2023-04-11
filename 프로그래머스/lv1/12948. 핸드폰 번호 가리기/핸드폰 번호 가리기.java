import java.util.*;

class Solution {
    public String solution(String phone_number) {
        //phone_number를 한글자씩 String 배열에 담기
        String []array_phone = phone_number.split("");
        
        //array_phone 배열에 담긴 것을 "*"로 바꾸기
        for(int loop=0; loop<(array_phone.length-4); loop++) {
            array_phone[loop] = "*";
        }
        
        //String 배열을 String으로 형 변환
        String answer = String.join("",array_phone);        
        return answer;
    }
}