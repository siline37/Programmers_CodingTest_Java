import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        //StringBuffer의 reverse() 사용
        StringBuffer sb = new StringBuffer(my_string);
        answer = sb.reverse().toString();
        
        //반복문 사용
        // for(int loop=my_string.length()-1; loop>=0; loop--) {
        //     answer += my_string.charAt(loop);
        // }
        return answer;
    }
}